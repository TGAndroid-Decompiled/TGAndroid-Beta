package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class pt1 implements bd8 {
    public final TL_iv.RichMessage a;
    public final ArrayList b;
    public final r47 c;

    public pt1(TL_iv.RichMessage richMessage, ArrayList arrayList, r47 r47Var) {
        this.a = richMessage;
        this.b = arrayList;
        this.c = r47Var;
    }

    @Override
    public final boolean a(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i);
                if (pageBlock instanceof TL_iv.pageBlockVideo) {
                    TLRPC.Document b = dx.b(this.a, ((TL_iv.pageBlockVideo) pageBlock).video_id);
                    if (b != null) {
                        return r47.J4(b);
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
                    TLRPC.Photo f = dx.f(richMessage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                    if (f != null && (w = xb4.w(f.sizes, hl.Y0(false), false, null, false)) != null) {
                        return dx.c(w);
                    }
                } else if ((pageBlock instanceof TL_iv.pageBlockVideo) && (b = dx.b(richMessage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) != null) {
                    return dx.c(b);
                }
            }
        }
        return null;
    }

    @Override
    public final String c(int i) {
        TLObject d = d(i);
        if (d instanceof TLRPC.Photo) {
            d = xb4.w(((TLRPC.Photo) d).sizes, hl.Y0(false), false, null, false);
        }
        return xb4.r(null, d);
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
                    return dx.f(richMessage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                }
                if (pageBlock instanceof TL_iv.pageBlockVideo) {
                    return dx.b(richMessage, ((TL_iv.pageBlockVideo) pageBlock).video_id);
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
            TLRPC.PhotoSize w = xb4.w(((TLRPC.Photo) tLObject).sizes, hl.Y0(false), false, null, false);
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
            TLRPC.PhotoSize w2 = xb4.w(document.thumbs, 320, false, null, true);
            if (w2 == null) {
                w2 = xb4.w(document.thumbs, 90, false, null, false);
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
        hl9 hl9Var = this.c.y2;
        if (hl9Var != null) {
            ArrayList arrayList = hl9Var.g;
            if (pageBlock != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    dk9 dk9Var = (dk9) arrayList.get(i);
                    if (dk9Var instanceof uk9) {
                        uk9 uk9Var = (uk9) dk9Var;
                        ArrayList arrayList2 = uk9Var.Y;
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            if (((xj9) arrayList2.get(i2)).b == pageBlock) {
                                int max = Math.max(0, Math.min(i2, arrayList2.size() - 1));
                                ValueAnimator valueAnimator = uk9Var.l0;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                    uk9Var.l0 = null;
                                }
                                if (uk9Var.b0 != max || uk9Var.c0 != 0.0f) {
                                    uk9Var.b0 = max;
                                    uk9Var.c0 = 0.0f;
                                    uk9Var.d0 = false;
                                    uk9Var.e0 = false;
                                    View view = uk9Var.W;
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
