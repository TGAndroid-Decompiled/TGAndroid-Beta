package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
public final class t3b extends z3b {
    public boolean C;
    public boolean D;
    public final String E;
    public int F;
    public final ArrayList G;
    public final ArrayList H;
    public int I;

    public t3b(int i, long j, String str, n3b n3bVar) {
        super(i, j, 4, -1, n3bVar);
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = 0;
        this.E = str;
    }

    @Override
    public final void C(ArrayList arrayList, boolean z) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        TL_bots.reorderPreviewMedias reorderpreviewmedias = new TL_bots.reorderPreviewMedias();
        int i = this.c;
        reorderpreviewmedias.bot = oc7.r1(i).n1(this.d);
        reorderpreviewmedias.lang_code = this.E;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Integer num = (Integer) obj;
            k47 f = f(num.intValue());
            if (f != null) {
                reorderpreviewmedias.order.add(oc7.h5(f.l.media));
                arrayList2.add(f);
                arrayList3.add(num);
            }
        }
        ConnectionsManager.getInstance(i).sendRequest(reorderpreviewmedias, null);
        ArrayList arrayList4 = this.H;
        if (arrayList4.isEmpty()) {
            arrayList4.add(new ArrayList());
        }
        ((ArrayList) arrayList4.get(0)).clear();
        ((ArrayList) arrayList4.get(0)).addAll(arrayList3);
        ArrayList arrayList5 = this.i;
        arrayList5.clear();
        arrayList5.addAll(arrayList2);
    }

    public final void F(ArrayList arrayList) {
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.i;
            if (i >= arrayList2.size()) {
                break;
            }
            k47 k47Var = (k47) arrayList2.get(i);
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    break;
                } else if (oc7.q0(k47Var.l.media, (TLRPC.MessageMedia) arrayList.get(i2))) {
                    arrayList2.remove(i);
                    ArrayList arrayList3 = this.H;
                    if (!arrayList3.isEmpty() && k47Var.e1() < ((ArrayList) arrayList3.get(0)).size()) {
                        ((ArrayList) arrayList3.get(0)).remove(k47Var.e1());
                    }
                    i--;
                } else {
                    i2++;
                }
            }
            i++;
        }
        TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
        int i3 = this.c;
        deletepreviewmedia.bot = oc7.r1(i3).n1(this.d);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            deletepreviewmedia.media.add(oc7.h5((TLRPC.MessageMedia) arrayList.get(i4)));
        }
        ConnectionsManager.getInstance(i3).sendRequest(deletepreviewmedia, null);
        w3b w3bVar = this.q;
        gm.r(w3bVar);
        gm.c3(w3bVar);
    }

    public final void G(TLRPC.InputMedia inputMedia, TL_bots.botPreviewMedia botpreviewmedia) {
        ArrayList arrayList;
        k47 k47Var;
        int e1;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        int i = 0;
        while (true) {
            arrayList = this.i;
            if (i < arrayList.size()) {
                k47Var = (k47) arrayList.get(i);
                if (inputMedia != null && (storyItem = k47Var.l) != null && (messageMedia = storyItem.media) != null) {
                    if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                        TLRPC.Photo photo = messageMedia.photo;
                        if (photo != null && photo.id == ((TLRPC.TL_inputMediaPhoto) inputMedia).id.id) {
                            break;
                        }
                    } else if ((inputMedia instanceof TLRPC.TL_inputMediaDocument) && (document = messageMedia.document) != null && document.id == ((TLRPC.TL_inputMediaDocument) inputMedia).id.id) {
                        break;
                    }
                }
                i++;
            } else {
                k47Var = null;
                i = 0;
                break;
            }
        }
        ArrayList arrayList2 = this.H;
        if (k47Var != null) {
            arrayList.remove(k47Var);
            if (arrayList2.isEmpty()) {
                arrayList2.add(new ArrayList());
            }
            if (i > 0 && i < ((ArrayList) arrayList2.get(0)).size()) {
                ((ArrayList) arrayList2.get(0)).remove(i);
            }
        }
        s3b s3bVar = new s3b(this, this.d, botpreviewmedia);
        k47 k47Var2 = new k47(this.c, s3bVar);
        TLRPC.Message message = k47Var2.k;
        if (k47Var == null) {
            e1 = this.I;
            this.I = e1 + 1;
        } else {
            e1 = k47Var.e1();
        }
        message.id = e1;
        s3bVar.id = e1;
        k47Var2.j = this;
        k47Var2.r0(false);
        if (arrayList2.isEmpty()) {
            arrayList2.add(new ArrayList());
        }
        ((ArrayList) arrayList2.get(0)).add(i, Integer.valueOf(k47Var2.e1()));
        arrayList.add(i, k47Var2);
        w3b w3bVar = this.q;
        gm.r(w3bVar);
        gm.c3(w3bVar);
    }

    public final boolean H(Runnable runnable) {
        TL_bots.getPreviewMedias getpreviewmedias;
        if (!this.C && !this.D) {
            long j = this.d;
            String str = this.E;
            int i = this.c;
            if (str != null) {
                TL_bots.getPreviewInfo getpreviewinfo = new TL_bots.getPreviewInfo();
                getpreviewinfo.bot = oc7.r1(i).n1(j);
                getpreviewinfo.lang_code = str;
                getpreviewmedias = getpreviewinfo;
            } else {
                TL_bots.getPreviewMedias getpreviewmedias2 = new TL_bots.getPreviewMedias();
                getpreviewmedias2.bot = oc7.r1(i).n1(j);
                getpreviewmedias = getpreviewmedias2;
            }
            this.C = true;
            this.F = ConnectionsManager.getInstance(i).sendRequest(getpreviewmedias, new ara(this, runnable, (byte) 8));
            return true;
        }
        return false;
    }

    public final void I(TL_bots.botPreviewMedia botpreviewmedia) {
        s3b s3bVar = new s3b(this, this.d, botpreviewmedia);
        k47 k47Var = new k47(this.c, s3bVar);
        TLRPC.Message message = k47Var.k;
        int i = this.I;
        this.I = i + 1;
        message.id = i;
        s3bVar.id = i;
        k47Var.j = this;
        k47Var.r0(false);
        ArrayList arrayList = this.H;
        if (arrayList.isEmpty()) {
            arrayList.add(new ArrayList());
        }
        ((ArrayList) arrayList.get(0)).add(0, Integer.valueOf(k47Var.e1()));
        this.i.add(0, k47Var);
        w3b w3bVar = this.q;
        gm.r(w3bVar);
        gm.c3(w3bVar);
    }

    @Override
    public final k47 f(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i2 < arrayList.size()) {
                if (((k47) arrayList.get(i2)).e1() == i) {
                    return (k47) arrayList.get(i2);
                }
                i2++;
            } else {
                return null;
            }
        }
    }

    @Override
    public final int g() {
        return this.i.size();
    }

    @Override
    public final ArrayList h() {
        return this.H;
    }

    @Override
    public final int i() {
        return this.i.size();
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
    public final boolean q(int i, List list, boolean z) {
        return H(null);
    }

    @Override
    public final boolean r(int i) {
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
