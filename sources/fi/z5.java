package fi;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
public final class z5 extends h6 {
    public boolean C;
    public boolean D;
    public final String E;
    public int F;
    public final ArrayList G;
    public final ArrayList H;
    public int I;

    public z5(int i7, long j3, String str, o5 o5Var) {
        super(i7, j3, 4, -1, o5Var);
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
        int i7 = this.f12036c;
        reorderpreviewmedias.bot = np.u1(i7).q1(this.d);
        reorderpreviewmedias.lang_code = this.E;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Integer num = (Integer) obj;
            gj f10 = f(num.intValue());
            if (f10 != null) {
                reorderpreviewmedias.order.add(np.l5(f10.f24182l.media));
                arrayList2.add(f10);
                arrayList3.add(num);
            }
        }
        ConnectionsManager.getInstance(i7).sendRequest(reorderpreviewmedias, null);
        ArrayList arrayList4 = this.H;
        if (arrayList4.isEmpty()) {
            arrayList4.add(new ArrayList());
        }
        ((ArrayList) arrayList4.get(0)).clear();
        ((ArrayList) arrayList4.get(0)).addAll(arrayList3);
        ArrayList arrayList5 = this.f12040i;
        arrayList5.clear();
        arrayList5.addAll(arrayList2);
    }

    public final void F(ArrayList arrayList) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f12040i;
            if (i7 >= arrayList2.size()) {
                break;
            }
            gj gjVar = (gj) arrayList2.get(i7);
            int i10 = 0;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                } else if (np.u0(gjVar.f24182l.media, (TLRPC.MessageMedia) arrayList.get(i10))) {
                    arrayList2.remove(i7);
                    ArrayList arrayList3 = this.H;
                    if (!arrayList3.isEmpty() && gjVar.e1() < ((ArrayList) arrayList3.get(0)).size()) {
                        ((ArrayList) arrayList3.get(0)).remove(gjVar.e1());
                    }
                    i7--;
                } else {
                    i10++;
                }
            }
            i7++;
        }
        TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
        int i11 = this.f12036c;
        deletepreviewmedia.bot = np.u1(i11).q1(this.d);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            deletepreviewmedia.media.add(np.l5((TLRPC.MessageMedia) arrayList.get(i12)));
        }
        ConnectionsManager.getInstance(i11).sendRequest(deletepreviewmedia, null);
        e6 e6Var = this.f12048q;
        org.telegram.messenger.g0.r(e6Var);
        org.telegram.messenger.g0.g3(e6Var);
    }

    public final void G(TLRPC.InputMedia inputMedia, TL_bots.botPreviewMedia botpreviewmedia) {
        ArrayList arrayList;
        gj gjVar;
        int e12;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        int i7 = 0;
        while (true) {
            arrayList = this.f12040i;
            if (i7 < arrayList.size()) {
                gjVar = (gj) arrayList.get(i7);
                if (inputMedia != null && (storyItem = gjVar.f24182l) != null && (messageMedia = storyItem.media) != null) {
                    if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                        TLRPC.Photo photo = messageMedia.photo;
                        if (photo != null && photo.f28422id == ((TLRPC.TL_inputMediaPhoto) inputMedia).f28461id.f28417id) {
                            break;
                        }
                    } else if ((inputMedia instanceof TLRPC.TL_inputMediaDocument) && (document = messageMedia.document) != null && document.f28404id == ((TLRPC.TL_inputMediaDocument) inputMedia).f28459id.f28410id) {
                        break;
                    }
                }
                i7++;
            } else {
                gjVar = null;
                i7 = 0;
                break;
            }
        }
        ArrayList arrayList2 = this.H;
        if (gjVar != null) {
            arrayList.remove(gjVar);
            if (arrayList2.isEmpty()) {
                arrayList2.add(new ArrayList());
            }
            if (i7 > 0 && i7 < ((ArrayList) arrayList2.get(0)).size()) {
                ((ArrayList) arrayList2.get(0)).remove(i7);
            }
        }
        y5 y5Var = new y5(this, this.d, botpreviewmedia);
        gj gjVar2 = new gj(this.f12036c, y5Var);
        TLRPC.Message message = gjVar2.f24177k;
        if (gjVar == null) {
            e12 = this.I;
            this.I = e12 + 1;
        } else {
            e12 = gjVar.e1();
        }
        message.f28419id = e12;
        y5Var.f28637id = e12;
        gjVar2.f24173j = this;
        gjVar2.r0(false);
        if (arrayList2.isEmpty()) {
            arrayList2.add(new ArrayList());
        }
        ((ArrayList) arrayList2.get(0)).add(i7, Integer.valueOf(gjVar2.e1()));
        arrayList.add(i7, gjVar2);
        e6 e6Var = this.f12048q;
        org.telegram.messenger.g0.r(e6Var);
        org.telegram.messenger.g0.g3(e6Var);
    }

    public final boolean H(Runnable runnable) {
        TL_bots.getPreviewMedias getpreviewmedias;
        if (!this.C && !this.D) {
            long j3 = this.d;
            String str = this.E;
            int i7 = this.f12036c;
            if (str != null) {
                TL_bots.getPreviewInfo getpreviewinfo = new TL_bots.getPreviewInfo();
                getpreviewinfo.bot = np.u1(i7).q1(j3);
                getpreviewinfo.lang_code = str;
                getpreviewmedias = getpreviewinfo;
            } else {
                TL_bots.getPreviewMedias getpreviewmedias2 = new TL_bots.getPreviewMedias();
                getpreviewmedias2.bot = np.u1(i7).q1(j3);
                getpreviewmedias = getpreviewmedias2;
            }
            this.C = true;
            this.F = ConnectionsManager.getInstance(i7).sendRequest(getpreviewmedias, new bi.o1(12, this, runnable));
            return true;
        }
        return false;
    }

    public final void I(TL_bots.botPreviewMedia botpreviewmedia) {
        y5 y5Var = new y5(this, this.d, botpreviewmedia);
        gj gjVar = new gj(this.f12036c, y5Var);
        TLRPC.Message message = gjVar.f24177k;
        int i7 = this.I;
        this.I = i7 + 1;
        message.f28419id = i7;
        y5Var.f28637id = i7;
        gjVar.f24173j = this;
        gjVar.r0(false);
        ArrayList arrayList = this.H;
        if (arrayList.isEmpty()) {
            arrayList.add(new ArrayList());
        }
        ((ArrayList) arrayList.get(0)).add(0, Integer.valueOf(gjVar.e1()));
        this.f12040i.add(0, gjVar);
        e6 e6Var = this.f12048q;
        org.telegram.messenger.g0.r(e6Var);
        org.telegram.messenger.g0.g3(e6Var);
    }

    @Override
    public final gj f(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f12040i;
            if (i10 < arrayList.size()) {
                if (((gj) arrayList.get(i10)).e1() == i7) {
                    return (gj) arrayList.get(i10);
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    @Override
    public final int g() {
        return this.f12040i.size();
    }

    @Override
    public final ArrayList h() {
        return this.H;
    }

    @Override
    public final int i() {
        return this.f12040i.size();
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
    public final boolean q(int i7, List list, boolean z10) {
        return H(null);
    }

    @Override
    public final boolean r(int i7) {
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
