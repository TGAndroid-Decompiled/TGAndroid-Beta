package defpackage;

import android.graphics.ColorFilter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c34 extends q59 {
    public final boolean c;
    public final e34 d;

    public c34(e34 e34Var, boolean z) {
        this.d = e34Var;
        this.c = z;
    }

    @Override
    public final boolean D(u69 u69Var) {
        return true;
    }

    @Override
    public final int b() {
        ArrayList arrayList;
        boolean z = this.c;
        e34 e34Var = this.d;
        if (z) {
            arrayList = e34Var.o1;
        } else {
            arrayList = e34Var.n1;
        }
        return arrayList.size();
    }

    @Override
    public final int d(int i) {
        return 0;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        ArrayList arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        gn5 k;
        int i2;
        String str;
        ColorFilter colorFilter;
        bf0 bf0Var = (bf0) u69Var.a;
        boolean z = this.c;
        e34 e34Var = this.d;
        if (z) {
            arrayList = e34Var.o1;
        } else {
            arrayList = e34Var.n1;
        }
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i);
        bf0Var.setTag(stickerSetCovered);
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
        } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            TLRPC.TL_messages_stickerSet n0 = hs6.d0(e34Var.d1).n0(hs6.b0(stickerSetCovered.set), false);
            if (n0 == null) {
                arrayList2 = null;
            } else {
                arrayList2 = n0.documents;
            }
        } else {
            arrayList2 = stickerSetCovered.covers;
        }
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null) {
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                if (stickerSetCovered.set != null) {
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        if (arrayList2.get(i3).id == stickerSetCovered.set.thumb_document_id) {
                            document = arrayList2.get(i3);
                            break;
                        }
                    }
                }
                document = null;
                if (document == null) {
                    document = arrayList2.get(0);
                }
            } else {
                document = null;
            }
        }
        if (document != null) {
            if (z) {
                if (k47.B4(document)) {
                    colorFilter = cmb.n0(e34Var.a2);
                } else {
                    colorFilter = null;
                }
                bf0Var.setColorFilter(colorFilter);
            }
            TLObject w = bc4.w(stickerSetCovered.set.thumbs, 90, false, null, false);
            meb d = eq3.d(stickerSetCovered.set.thumbs, cmb.b7, 0.2f, false);
            if (d != null) {
                d.e = 512;
                d.f = 512;
            }
            if (w == null || k47.M4(document)) {
                w = document;
            }
            boolean z2 = w instanceof TLRPC.Document;
            if (z2) {
                k = gn5.c(bc4.w(document.thumbs, 90, false, null, false), document);
            } else if (w instanceof TLRPC.PhotoSize) {
                k = gn5.k((TLRPC.PhotoSize) w, document, stickerSetCovered.set.thumb_version);
            } else {
                return;
            }
            gn5 gn5Var = k;
            if (gn5Var != null) {
                if (z) {
                    i2 = 16388;
                } else {
                    i2 = 1;
                }
                if (!e86.e(i2)) {
                    str = "30_30_firstframe";
                } else {
                    str = "30_30";
                }
                String str2 = str;
                if (z2 && (k47.K2(document, true) || k47.M4(document))) {
                    if (d != null) {
                        bf0Var.p(gn5.b(document), str2, d, stickerSetCovered);
                    } else {
                        bf0Var.h(gn5.b(document), str2, gn5Var, null, 0, stickerSetCovered);
                    }
                } else if (gn5Var.p == 1) {
                    bf0Var.n(gn5Var, str2, "tgs", d, stickerSetCovered);
                } else {
                    bf0Var.n(gn5Var, null, "webp", d, stickerSetCovered);
                }
            }
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        b34 b34Var = new b34(this, this.d.getContext());
        b34Var.t(gm.L(24.0f), gm.L(24.0f));
        b34Var.setLayerNum(1);
        b34Var.setAspectFit(true);
        b34Var.setLayoutParams(new g69(gm.L(34.0f), gm.L(34.0f)));
        return new u69(b34Var);
    }
}
