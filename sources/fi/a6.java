package fi;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.fj;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
public final class a6 extends h6 {
    public boolean C;
    public boolean D;
    public final String E;
    public int F;
    public final ArrayList G;
    public final ArrayList H;
    public int I;

    public a6(int i7, long j3, String str, p5 p5Var) {
        super(i7, j3, 4, -1, p5Var);
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
        int i7 = this.f12047c;
        reorderpreviewmedias.bot = mp.u1(i7).q1(this.d);
        reorderpreviewmedias.lang_code = this.E;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Integer num = (Integer) obj;
            fj f10 = f(num.intValue());
            if (f10 != null) {
                reorderpreviewmedias.order.add(mp.l5(f10.f24078l.media));
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
        ArrayList arrayList5 = this.f12051i;
        arrayList5.clear();
        arrayList5.addAll(arrayList2);
    }

    public final void F(ArrayList arrayList) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f12051i;
            if (i7 >= arrayList2.size()) {
                break;
            }
            fj fjVar = (fj) arrayList2.get(i7);
            int i10 = 0;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                } else if (mp.u0(fjVar.f24078l.media, (TLRPC.MessageMedia) arrayList.get(i10))) {
                    arrayList2.remove(i7);
                    ArrayList arrayList3 = this.H;
                    if (!arrayList3.isEmpty() && fjVar.e1() < ((ArrayList) arrayList3.get(0)).size()) {
                        ((ArrayList) arrayList3.get(0)).remove(fjVar.e1());
                    }
                    i7--;
                } else {
                    i10++;
                }
            }
            i7++;
        }
        TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
        int i11 = this.f12047c;
        deletepreviewmedia.bot = mp.u1(i11).q1(this.d);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            deletepreviewmedia.media.add(mp.l5((TLRPC.MessageMedia) arrayList.get(i12)));
        }
        ConnectionsManager.getInstance(i11).sendRequest(deletepreviewmedia, null);
        e6 e6Var = this.f12059q;
        org.telegram.messenger.g0.r(e6Var);
        org.telegram.messenger.g0.g3(e6Var);
    }

    public final void G(TLRPC.InputMedia inputMedia, TL_bots.botPreviewMedia botpreviewmedia) {
        ArrayList arrayList;
        fj fjVar;
        int e12;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        int i7 = 0;
        while (true) {
            arrayList = this.f12051i;
            if (i7 < arrayList.size()) {
                fjVar = (fj) arrayList.get(i7);
                if (inputMedia != null && (storyItem = fjVar.f24078l) != null && (messageMedia = storyItem.media) != null) {
                    if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                        TLRPC.Photo photo = messageMedia.photo;
                        if (photo != null && photo.f28516id == ((TLRPC.TL_inputMediaPhoto) inputMedia).f28555id.f28511id) {
                            break;
                        }
                    } else if ((inputMedia instanceof TLRPC.TL_inputMediaDocument) && (document = messageMedia.document) != null && document.f28498id == ((TLRPC.TL_inputMediaDocument) inputMedia).f28553id.f28504id) {
                        break;
                    }
                }
                i7++;
            } else {
                fjVar = null;
                i7 = 0;
                break;
            }
        }
        ArrayList arrayList2 = this.H;
        if (fjVar != null) {
            arrayList.remove(fjVar);
            if (arrayList2.isEmpty()) {
                arrayList2.add(new ArrayList());
            }
            if (i7 > 0 && i7 < ((ArrayList) arrayList2.get(0)).size()) {
                ((ArrayList) arrayList2.get(0)).remove(i7);
            }
        }
        z5 z5Var = new z5(this, this.d, botpreviewmedia);
        fj fjVar2 = new fj(this.f12047c, z5Var);
        TLRPC.Message message = fjVar2.f24073k;
        if (fjVar == null) {
            e12 = this.I;
            this.I = e12 + 1;
        } else {
            e12 = fjVar.e1();
        }
        message.f28513id = e12;
        z5Var.f28731id = e12;
        fjVar2.f24069j = this;
        fjVar2.r0(false);
        if (arrayList2.isEmpty()) {
            arrayList2.add(new ArrayList());
        }
        ((ArrayList) arrayList2.get(0)).add(i7, Integer.valueOf(fjVar2.e1()));
        arrayList.add(i7, fjVar2);
        e6 e6Var = this.f12059q;
        org.telegram.messenger.g0.r(e6Var);
        org.telegram.messenger.g0.g3(e6Var);
    }

    public final boolean H(Runnable runnable) {
        TL_bots.getPreviewMedias getpreviewmedias;
        if (!this.C && !this.D) {
            long j3 = this.d;
            String str = this.E;
            int i7 = this.f12047c;
            if (str != null) {
                TL_bots.getPreviewInfo getpreviewinfo = new TL_bots.getPreviewInfo();
                getpreviewinfo.bot = mp.u1(i7).q1(j3);
                getpreviewinfo.lang_code = str;
                getpreviewmedias = getpreviewinfo;
            } else {
                TL_bots.getPreviewMedias getpreviewmedias2 = new TL_bots.getPreviewMedias();
                getpreviewmedias2.bot = mp.u1(i7).q1(j3);
                getpreviewmedias = getpreviewmedias2;
            }
            this.C = true;
            this.F = ConnectionsManager.getInstance(i7).sendRequest(getpreviewmedias, new bi.o1(12, this, runnable));
            return true;
        }
        return false;
    }

    public final void I(TL_bots.botPreviewMedia botpreviewmedia) {
        z5 z5Var = new z5(this, this.d, botpreviewmedia);
        fj fjVar = new fj(this.f12047c, z5Var);
        TLRPC.Message message = fjVar.f24073k;
        int i7 = this.I;
        this.I = i7 + 1;
        message.f28513id = i7;
        z5Var.f28731id = i7;
        fjVar.f24069j = this;
        fjVar.r0(false);
        ArrayList arrayList = this.H;
        if (arrayList.isEmpty()) {
            arrayList.add(new ArrayList());
        }
        ((ArrayList) arrayList.get(0)).add(0, Integer.valueOf(fjVar.e1()));
        this.f12051i.add(0, fjVar);
        e6 e6Var = this.f12059q;
        org.telegram.messenger.g0.r(e6Var);
        org.telegram.messenger.g0.g3(e6Var);
    }

    @Override
    public final fj f(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f12051i;
            if (i10 < arrayList.size()) {
                if (((fj) arrayList.get(i10)).e1() == i7) {
                    return (fj) arrayList.get(i10);
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    @Override
    public final int g() {
        return this.f12051i.size();
    }

    @Override
    public final ArrayList h() {
        return this.H;
    }

    @Override
    public final int i() {
        return this.f12051i.size();
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
