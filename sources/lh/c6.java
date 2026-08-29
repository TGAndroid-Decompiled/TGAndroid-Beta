package lh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
public final class c6 extends k6 {
    public boolean C;
    public boolean D;
    public final String E;
    public int F;
    public final ArrayList G;
    public final ArrayList H;
    public int I;

    public c6(int i10, long j10, String str, ag.i0 i0Var) {
        super(i10, j10, 4, -1, i0Var);
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = 0;
        this.E = str;
    }

    @Override
    public final void C(ArrayList arrayList, boolean z10) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        TL_bots.reorderPreviewMedias reorderpreviewmedias = new TL_bots.reorderPreviewMedias();
        int i10 = this.f15834c;
        reorderpreviewmedias.bot = MessagesController.getInstance(i10).getInputUser(this.d);
        reorderpreviewmedias.lang_code = this.E;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Integer num = (Integer) obj;
            MessageObject f9 = f(num.intValue());
            if (f9 != null) {
                reorderpreviewmedias.order.add(MessagesController.toInputMedia(f9.storyItem.media));
                arrayList2.add(f9);
                arrayList3.add(num);
            }
        }
        ConnectionsManager.getInstance(i10).sendRequest(reorderpreviewmedias, null);
        ArrayList arrayList4 = this.H;
        if (arrayList4.isEmpty()) {
            arrayList4.add(new ArrayList());
        }
        ((ArrayList) arrayList4.get(0)).clear();
        ((ArrayList) arrayList4.get(0)).addAll(arrayList3);
        ArrayList arrayList5 = this.f15838i;
        arrayList5.clear();
        arrayList5.addAll(arrayList2);
    }

    public final void F(ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f15838i;
            if (i10 >= arrayList2.size()) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList2.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                } else if (MessagesController.equals(messageObject.storyItem.media, (TLRPC.MessageMedia) arrayList.get(i11))) {
                    arrayList2.remove(i10);
                    ArrayList arrayList3 = this.H;
                    if (!arrayList3.isEmpty() && messageObject.getId() < ((ArrayList) arrayList3.get(0)).size()) {
                        ((ArrayList) arrayList3.get(0)).remove(messageObject.getId());
                    }
                    i10--;
                } else {
                    i11++;
                }
            }
            i10++;
        }
        TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
        int i12 = this.f15834c;
        deletepreviewmedia.bot = MessagesController.getInstance(i12).getInputUser(this.d);
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            deletepreviewmedia.media.add(MessagesController.toInputMedia((TLRPC.MessageMedia) arrayList.get(i13)));
        }
        ConnectionsManager.getInstance(i12).sendRequest(deletepreviewmedia, null);
        h6 h6Var = this.f15846q;
        AndroidUtilities.cancelRunOnUIThread(h6Var);
        AndroidUtilities.runOnUIThread(h6Var);
    }

    public final void G(TLRPC.InputMedia inputMedia, TL_bots.botPreviewMedia botpreviewmedia) {
        ArrayList arrayList;
        MessageObject messageObject;
        int id2;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        int i10 = 0;
        while (true) {
            arrayList = this.f15838i;
            if (i10 < arrayList.size()) {
                messageObject = (MessageObject) arrayList.get(i10);
                if (inputMedia != null && (storyItem = messageObject.storyItem) != null && (messageMedia = storyItem.media) != null) {
                    if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                        TLRPC.Photo photo = messageMedia.photo;
                        if (photo != null && photo.f22416id == ((TLRPC.TL_inputMediaPhoto) inputMedia).f22455id.f22411id) {
                            break;
                        }
                    } else if ((inputMedia instanceof TLRPC.TL_inputMediaDocument) && (document = messageMedia.document) != null && document.f22398id == ((TLRPC.TL_inputMediaDocument) inputMedia).f22453id.f22404id) {
                        break;
                    }
                }
                i10++;
            } else {
                messageObject = null;
                i10 = 0;
                break;
            }
        }
        ArrayList arrayList2 = this.H;
        if (messageObject != null) {
            arrayList.remove(messageObject);
            if (arrayList2.isEmpty()) {
                arrayList2.add(new ArrayList());
            }
            if (i10 > 0 && i10 < ((ArrayList) arrayList2.get(0)).size()) {
                ((ArrayList) arrayList2.get(0)).remove(i10);
            }
        }
        MessageObject messageObject2 = new MessageObject(this.f15834c, new b6(this, this.d, botpreviewmedia));
        TL_stories.StoryItem storyItem2 = messageObject2.storyItem;
        TLRPC.Message message = messageObject2.messageOwner;
        if (messageObject == null) {
            id2 = this.I;
            this.I = id2 + 1;
        } else {
            id2 = messageObject.getId();
        }
        message.f22413id = id2;
        storyItem2.f22629id = id2;
        messageObject2.parentStoriesList = this;
        messageObject2.generateThumbs(false);
        if (arrayList2.isEmpty()) {
            arrayList2.add(new ArrayList());
        }
        ((ArrayList) arrayList2.get(0)).add(i10, Integer.valueOf(messageObject2.getId()));
        arrayList.add(i10, messageObject2);
        h6 h6Var = this.f15846q;
        AndroidUtilities.cancelRunOnUIThread(h6Var);
        AndroidUtilities.runOnUIThread(h6Var);
    }

    public final boolean H(Runnable runnable) {
        TL_bots.getPreviewMedias getpreviewmedias;
        if (!this.C && !this.D) {
            long j10 = this.d;
            String str = this.E;
            int i10 = this.f15834c;
            if (str != null) {
                TL_bots.getPreviewInfo getpreviewinfo = new TL_bots.getPreviewInfo();
                getpreviewinfo.bot = MessagesController.getInstance(i10).getInputUser(j10);
                getpreviewinfo.lang_code = str;
                getpreviewmedias = getpreviewinfo;
            } else {
                TL_bots.getPreviewMedias getpreviewmedias2 = new TL_bots.getPreviewMedias();
                getpreviewmedias2.bot = MessagesController.getInstance(i10).getInputUser(j10);
                getpreviewmedias = getpreviewmedias2;
            }
            this.C = true;
            this.F = ConnectionsManager.getInstance(i10).sendRequest(getpreviewmedias, new bg.h3(13, this, runnable));
            return true;
        }
        return false;
    }

    public final void I(TL_bots.botPreviewMedia botpreviewmedia) {
        MessageObject messageObject = new MessageObject(this.f15834c, new b6(this, this.d, botpreviewmedia));
        TL_stories.StoryItem storyItem = messageObject.storyItem;
        TLRPC.Message message = messageObject.messageOwner;
        int i10 = this.I;
        this.I = i10 + 1;
        message.f22413id = i10;
        storyItem.f22629id = i10;
        messageObject.parentStoriesList = this;
        messageObject.generateThumbs(false);
        ArrayList arrayList = this.H;
        if (arrayList.isEmpty()) {
            arrayList.add(new ArrayList());
        }
        ((ArrayList) arrayList.get(0)).add(0, Integer.valueOf(messageObject.getId()));
        this.f15838i.add(0, messageObject);
        h6 h6Var = this.f15846q;
        AndroidUtilities.cancelRunOnUIThread(h6Var);
        AndroidUtilities.runOnUIThread(h6Var);
    }

    @Override
    public final MessageObject f(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f15838i;
            if (i11 < arrayList.size()) {
                if (((MessageObject) arrayList.get(i11)).getId() == i10) {
                    return (MessageObject) arrayList.get(i11);
                }
                i11++;
            } else {
                return null;
            }
        }
    }

    @Override
    public final int g() {
        return this.f15838i.size();
    }

    @Override
    public final ArrayList h() {
        return this.H;
    }

    @Override
    public final int i() {
        return this.f15838i.size();
    }

    @Override
    public final boolean k() {
        return this.C;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final boolean q(int i10, List list, boolean z10) {
        return H(null);
    }

    @Override
    public final boolean r(int i10) {
        return false;
    }

    @Override
    public final void j() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void x() {
    }
}
