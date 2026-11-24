package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class ct1 implements l98 {
    public final TL_iv.RichMessage a;
    public final ArrayList b;
    public final k27 c;

    public ct1(TL_iv.RichMessage richMessage, ArrayList arrayList, k27 k27Var) {
        this.a = richMessage;
        this.b = arrayList;
        this.c = k27Var;
    }

    @Override
    public final boolean a(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i);
                if (pageBlock instanceof TL_iv.pageBlockVideo) {
                    TLRPC.Document b = cx.b(this.a, ((TL_iv.pageBlockVideo) pageBlock).video_id);
                    if (b != null) {
                        return k27.J4(b);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final File b(int i) {
        TLRPC.Document b;
        TLRPC.PhotoSize w;
        if (i >= 0) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i);
                boolean z = pageBlock instanceof TL_iv.pageBlockPhoto;
                TL_iv.RichMessage richMessage = this.a;
                if (z) {
                    TLRPC.Photo f = cx.f(richMessage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                    if (f != null && (w = ba4.w(f.sizes, gl.Y0(false), false, null, false)) != null) {
                        return cx.c(w);
                    }
                } else if ((pageBlock instanceof TL_iv.pageBlockVideo) && (b = cx.b(richMessage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) != null) {
                    return cx.c(b);
                }
            }
        }
        return null;
    }

    @Override
    public final String c(int i) {
        TLObject d = d(i);
        if (d instanceof TLRPC.Photo) {
            d = ba4.w(((TLRPC.Photo) d).sizes, gl.Y0(false), false, null, false);
        }
        return ba4.r(null, d);
    }

    @Override
    public final TLObject d(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i);
                boolean z = pageBlock instanceof TL_iv.pageBlockPhoto;
                TL_iv.RichMessage richMessage = this.a;
                if (z) {
                    return cx.f(richMessage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                }
                if (pageBlock instanceof TL_iv.pageBlockVideo) {
                    return cx.b(richMessage, ((TL_iv.pageBlockVideo) pageBlock).video_id);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean e(int i) {
        return false;
    }

    @Override
    public final TLRPC.PhotoSize f(TLObject tLObject, int[] iArr) {
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.PhotoSize w = ba4.w(((TLRPC.Photo) tLObject).sizes, gl.Y0(false), false, null, false);
            if (w != null) {
                int i = w.size;
                iArr[0] = i;
                if (i == 0) {
                    iArr[0] = -1;
                }
                return w;
            }
            iArr[0] = -1;
            return null;
        }
        if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            TLRPC.PhotoSize w2 = ba4.w(document.thumbs, 320, false, null, true);
            if (w2 == null) {
                w2 = ba4.w(document.thumbs, 90, false, null, false);
            }
            if (w2 != null) {
                int i2 = w2.size;
                iArr[0] = i2;
                if (i2 == 0) {
                    iArr[0] = -1;
                }
                return w2;
            }
            iArr[0] = -1;
        }
        return null;
    }

    @Override
    public final Object g() {
        return this.c;
    }

    @Override
    public final TL_iv.PageBlock get(int i) {
        return (TL_iv.PageBlock) this.b.get(i);
    }

    @Override
    public final List getAll() {
        return this.b;
    }

    @Override
    public final void h(TL_iv.PageBlock pageBlock) {
        rh9 rh9Var = this.c.y2;
        if (rh9Var != null) {
            ArrayList arrayList = rh9Var.g;
            if (pageBlock != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    mg9 mg9Var = (mg9) arrayList.get(i);
                    if (mg9Var instanceof eh9) {
                        eh9 eh9Var = (eh9) mg9Var;
                        ArrayList arrayList2 = eh9Var.Y;
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            if (((gg9) arrayList2.get(i2)).b == pageBlock) {
                                int max = Math.max(0, Math.min(i2, arrayList2.size() - 1));
                                ValueAnimator valueAnimator = eh9Var.l0;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                    eh9Var.l0 = null;
                                }
                                if (eh9Var.b0 != max || eh9Var.c0 != 0.0f) {
                                    eh9Var.b0 = max;
                                    eh9Var.c0 = 0.0f;
                                    eh9Var.d0 = false;
                                    eh9Var.e0 = false;
                                    View view = eh9Var.W;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                        continue;
                    }
                }
            }
        }
    }

    @Override
    public final CharSequence i(int i) {
        return null;
    }

    @Override
    public final int j() {
        return this.b.size();
    }
}
