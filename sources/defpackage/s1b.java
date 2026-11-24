package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
public final class s1b extends y1b {
    public boolean C;
    public boolean D;
    public final String E;
    public int F;
    public final ArrayList G;
    public final ArrayList H;
    public int I;

    public s1b(int i, long j, String str, l1b l1bVar) {
        super(i, j, 4, -1, l1bVar);
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
        reorderpreviewmedias.bot = na7.q1(i).m1(this.d);
        reorderpreviewmedias.lang_code = this.E;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Integer num = (Integer) obj;
            k27 f = f(num.intValue());
            if (f != null) {
                reorderpreviewmedias.order.add(na7.f5(f.l.media));
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
            k27 k27Var = (k27) arrayList2.get(i);
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    break;
                } else if (na7.q0(k27Var.l.media, (TLRPC.MessageMedia) arrayList.get(i2))) {
                    arrayList2.remove(i);
                    ArrayList arrayList3 = this.H;
                    if (!arrayList3.isEmpty() && k27Var.e1() < ((ArrayList) arrayList3.get(0)).size()) {
                        ((ArrayList) arrayList3.get(0)).remove(k27Var.e1());
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
        deletepreviewmedia.bot = na7.q1(i3).m1(this.d);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            deletepreviewmedia.media.add(na7.f5((TLRPC.MessageMedia) arrayList.get(i4)));
        }
        ConnectionsManager.getInstance(i3).sendRequest(deletepreviewmedia, null);
        v1b v1bVar = this.q;
        gl.r(v1bVar);
        gl.c3(v1bVar);
    }

    public final void G(TLRPC.InputMedia inputMedia, TL_bots.botPreviewMedia botpreviewmedia) {
        ArrayList arrayList;
        k27 k27Var;
        int e1;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        int i = 0;
        while (true) {
            arrayList = this.i;
            if (i < arrayList.size()) {
                k27Var = (k27) arrayList.get(i);
                if (inputMedia != null && (storyItem = k27Var.l) != null && (messageMedia = storyItem.media) != null) {
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
                k27Var = null;
                i = 0;
                break;
            }
        }
        ArrayList arrayList2 = this.H;
        if (k27Var != null) {
            arrayList.remove(k27Var);
            if (arrayList2.isEmpty()) {
                arrayList2.add(new ArrayList());
            }
            if (i > 0 && i < ((ArrayList) arrayList2.get(0)).size()) {
                ((ArrayList) arrayList2.get(0)).remove(i);
            }
        }
        q1b q1bVar = new q1b(this, this.d, botpreviewmedia);
        k27 k27Var2 = new k27(this.c, q1bVar);
        TLRPC.Message message = k27Var2.k;
        if (k27Var == null) {
            e1 = this.I;
            this.I = e1 + 1;
        } else {
            e1 = k27Var.e1();
        }
        message.id = e1;
        q1bVar.id = e1;
        k27Var2.j = this;
        k27Var2.r0(false);
        if (arrayList2.isEmpty()) {
            arrayList2.add(new ArrayList());
        }
        ((ArrayList) arrayList2.get(0)).add(i, Integer.valueOf(k27Var2.e1()));
        arrayList.add(i, k27Var2);
        v1b v1bVar = this.q;
        gl.r(v1bVar);
        gl.c3(v1bVar);
    }

    public final boolean H(Runnable runnable) {
        TL_bots.getPreviewMedias getpreviewmedias;
        if (!this.C && !this.D) {
            long j = this.d;
            String str = this.E;
            int i = this.c;
            if (str != null) {
                TL_bots.getPreviewInfo getpreviewinfo = new TL_bots.getPreviewInfo();
                getpreviewinfo.bot = na7.q1(i).m1(j);
                getpreviewinfo.lang_code = str;
                getpreviewmedias = getpreviewinfo;
            } else {
                TL_bots.getPreviewMedias getpreviewmedias2 = new TL_bots.getPreviewMedias();
                getpreviewmedias2.bot = na7.q1(i).m1(j);
                getpreviewmedias = getpreviewmedias2;
            }
            this.C = true;
            this.F = ConnectionsManager.getInstance(i).sendRequest(getpreviewmedias, new apa(this, runnable, (byte) 8));
            return true;
        }
        return false;
    }

    public final void I(TL_bots.botPreviewMedia botpreviewmedia) {
        q1b q1bVar = new q1b(this, this.d, botpreviewmedia);
        k27 k27Var = new k27(this.c, q1bVar);
        TLRPC.Message message = k27Var.k;
        int i = this.I;
        this.I = i + 1;
        message.id = i;
        q1bVar.id = i;
        k27Var.j = this;
        k27Var.r0(false);
        ArrayList arrayList = this.H;
        if (arrayList.isEmpty()) {
            arrayList.add(new ArrayList());
        }
        ((ArrayList) arrayList.get(0)).add(0, Integer.valueOf(k27Var.e1()));
        this.i.add(0, k27Var);
        v1b v1bVar = this.q;
        gl.r(v1bVar);
        gl.c3(v1bVar);
    }

    @Override
    public final k27 f(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i2 < arrayList.size()) {
                if (((k27) arrayList.get(i2)).e1() == i) {
                    return (k27) arrayList.get(i2);
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
