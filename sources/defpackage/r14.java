package defpackage;

import android.graphics.ColorFilter;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r14 extends n39 {
    public final boolean c;
    public final t14 d;

    public r14(t14 t14Var, boolean z) {
        this.d = t14Var;
        this.c = z;
    }

    @Override
    public final boolean D(s49 s49Var) {
        return true;
    }

    @Override
    public final int b() {
        ArrayList arrayList;
        boolean z = this.c;
        t14 t14Var = this.d;
        if (z) {
            arrayList = t14Var.o1;
        } else {
            arrayList = t14Var.n1;
        }
        return arrayList.size();
    }

    @Override
    public final int d(int i) {
        return 0;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        ArrayList arrayList;
        ArrayList<TLRPC.Document> arrayList2;
        gl5 k;
        int i2;
        String str;
        ColorFilter colorFilter;
        be0 be0Var = (be0) s49Var.a;
        boolean z = this.c;
        t14 t14Var = this.d;
        if (z) {
            arrayList = t14Var.o1;
        } else {
            arrayList = t14Var.n1;
        }
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i);
        be0Var.setTag(stickerSetCovered);
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
        } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            TLRPC.TL_messages_stickerSet n0 = hq6.d0(t14Var.d1).n0(hq6.b0(stickerSetCovered.set), false);
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
                if (k27.B4(document)) {
                    colorFilter = bkb.n0(t14Var.a2);
                } else {
                    colorFilter = null;
                }
                be0Var.setColorFilter(colorFilter);
            }
            TLObject w = ba4.w(stickerSetCovered.set.thumbs, 90, false, null, false);
            kcb d = uo3.d(stickerSetCovered.set.thumbs, bkb.b7, 0.2f, false);
            if (d != null) {
                d.e = 512;
                d.f = 512;
            }
            if (w == null || k27.M4(document)) {
                w = document;
            }
            boolean z2 = w instanceof TLRPC.Document;
            if (z2) {
                k = gl5.c(ba4.w(document.thumbs, 90, false, null, false), document);
            } else if (w instanceof TLRPC.PhotoSize) {
                k = gl5.k((TLRPC.PhotoSize) w, document, stickerSetCovered.set.thumb_version);
            } else {
                return;
            }
            gl5 gl5Var = k;
            if (gl5Var != null) {
                if (z) {
                    i2 = 16388;
                } else {
                    i2 = 1;
                }
                if (!e66.e(i2)) {
                    str = "30_30_firstframe";
                } else {
                    str = "30_30";
                }
                String str2 = str;
                if (z2 && (k27.K2(document, true) || k27.M4(document))) {
                    if (d != null) {
                        be0Var.p(gl5.b(document), str2, d, stickerSetCovered);
                    } else {
                        be0Var.h(gl5.b(document), str2, gl5Var, null, 0, stickerSetCovered);
                    }
                } else if (gl5Var.p == 1) {
                    be0Var.n(gl5Var, str2, "tgs", d, stickerSetCovered);
                } else {
                    be0Var.n(gl5Var, null, "webp", d, stickerSetCovered);
                }
            }
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        q14 q14Var = new q14(this, this.d.getContext());
        q14Var.t(gl.L(24.0f), gl.L(24.0f));
        q14Var.setLayerNum(1);
        q14Var.setAspectFit(true);
        q14Var.setLayoutParams(new e49(gl.L(34.0f), gl.L(34.0f)));
        return new s49(q14Var);
    }
}
