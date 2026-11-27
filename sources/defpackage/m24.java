package defpackage;

import android.graphics.ColorFilter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m24 extends c79 {
    public final boolean c;
    public final o24 d;

    public m24(o24 o24Var, boolean z) {
        this.d = o24Var;
        this.c = z;
    }

    @Override
    public final boolean D(f89 f89Var) {
        return true;
    }

    @Override
    public final int b() {
        ArrayList arrayList;
        boolean z = this.c;
        o24 o24Var = this.d;
        if (z) {
            arrayList = o24Var.o1;
        } else {
            arrayList = o24Var.n1;
        }
        return arrayList.size();
    }

    @Override
    public final int d(int i) {
        return 0;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        ArrayList arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        jn5 k;
        int i2;
        String str;
        ColorFilter colorFilter;
        de0 de0Var = (de0) f89Var.a;
        boolean z = this.c;
        o24 o24Var = this.d;
        if (z) {
            arrayList = o24Var.o1;
        } else {
            arrayList = o24Var.n1;
        }
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i);
        de0Var.setTag(stickerSetCovered);
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
        } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            TLRPC.TL_messages_stickerSet n0 = ls6.d0(o24Var.d1).n0(ls6.b0(stickerSetCovered.set), false);
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
                if (r47.B4(document)) {
                    colorFilter = aob.n0(o24Var.a2);
                } else {
                    colorFilter = null;
                }
                de0Var.setColorFilter(colorFilter);
            }
            TLObject w = xb4.w(stickerSetCovered.set.thumbs, 90, false, null, false);
            ggb d = lp3.d(stickerSetCovered.set.thumbs, aob.c7, 0.2f, false);
            if (d != null) {
                d.e = 512;
                d.f = 512;
            }
            if (w == null || r47.M4(document)) {
                w = document;
            }
            boolean z2 = w instanceof TLRPC.Document;
            if (z2) {
                k = jn5.c(xb4.w(document.thumbs, 90, false, null, false), document);
            } else if (w instanceof TLRPC.PhotoSize) {
                k = jn5.k((TLRPC.PhotoSize) w, document, stickerSetCovered.set.thumb_version);
            } else {
                return;
            }
            jn5 jn5Var = k;
            if (jn5Var != null) {
                if (z) {
                    i2 = 16388;
                } else {
                    i2 = 1;
                }
                if (!i86.e(i2)) {
                    str = "30_30_firstframe";
                } else {
                    str = "30_30";
                }
                String str2 = str;
                if (z2 && (r47.K2(document, true) || r47.M4(document))) {
                    if (d != null) {
                        de0Var.p(jn5.b(document), str2, d, stickerSetCovered);
                    } else {
                        de0Var.h(jn5.b(document), str2, jn5Var, null, 0, stickerSetCovered);
                    }
                } else if (jn5Var.p == 1) {
                    de0Var.n(jn5Var, str2, "tgs", d, stickerSetCovered);
                } else {
                    de0Var.n(jn5Var, null, "webp", d, stickerSetCovered);
                }
            }
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        l24 l24Var = new l24(this, this.d.getContext());
        l24Var.t(hl.L(24.0f), hl.L(24.0f));
        l24Var.setLayerNum(1);
        l24Var.setAspectFit(true);
        l24Var.setLayoutParams(new r79(hl.L(34.0f), hl.L(34.0f)));
        return new f89(l24Var);
    }
}
