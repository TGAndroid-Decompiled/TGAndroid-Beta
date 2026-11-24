package defpackage;

import android.view.View;
import java.io.File;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;
public final class lw implements l98 {
    public final TLRPC.WebPage a;
    public final List b;
    public final o c;

    public lw(o oVar, TLRPC.WebPage webPage, List list) {
        this.c = oVar;
        this.a = webPage;
        this.b = list;
    }

    @Override
    public final boolean a(int i) {
        if (i < this.b.size() && i >= 0 && cx.g(this.a, get(i))) {
            return true;
        }
        return false;
    }

    @Override
    public final File b(int i) {
        TLRPC.Document a;
        TLRPC.PhotoSize w;
        if (i < this.b.size() && i >= 0) {
            TL_iv.PageBlock pageBlock = get(i);
            boolean z = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.a;
            if (z) {
                TLRPC.Photo e = cx.e(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                if (e != null && (w = ba4.w(e.sizes, gl.Y0(false), false, null, false)) != null) {
                    return cx.c(w);
                }
            } else if ((pageBlock instanceof TL_iv.pageBlockVideo) && (a = cx.a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) != null) {
                return cx.c(a);
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
        if (i < this.b.size() && i >= 0) {
            TL_iv.PageBlock pageBlock = get(i);
            boolean z = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.a;
            if (z) {
                return cx.e(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                return cx.a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id);
            }
        }
        return null;
    }

    @Override
    public final boolean e(int i) {
        if (i < this.b.size() && i >= 0 && !cx.g(this.a, get(i))) {
            dx dxVar = this.c.v0[0].c;
            TL_iv.PageBlock pageBlock = get(i);
            dxVar.getClass();
            if (dx.I(pageBlock) == 5) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final TLRPC.PhotoSize f(TLObject tLObject, int[] iArr) {
        TLRPC.PhotoSize w;
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.PhotoSize w2 = ba4.w(((TLRPC.Photo) tLObject).sizes, gl.Y0(false), false, null, false);
            if (w2 != null) {
                int i = w2.size;
                iArr[0] = i;
                if (i == 0) {
                    iArr[0] = -1;
                }
                return w2;
            }
            iArr[0] = -1;
            return null;
        } else if (!(tLObject instanceof TLRPC.Document) || (w = ba4.w(((TLRPC.Document) tLObject).thumbs, 90, false, null, false)) == null) {
            return null;
        } else {
            int i2 = w.size;
            iArr[0] = i2;
            if (i2 == 0) {
                iArr[0] = -1;
            }
            return w;
        }
    }

    @Override
    public final Object g() {
        return this.a;
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
        o oVar = this.c;
        int childCount = oVar.v0[0].b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = oVar.v0[0].b.getChildAt(i);
            if (childAt instanceof pv) {
                pv pvVar = (pv) childAt;
                int indexOf = pvVar.e.items.indexOf(pageBlock);
                if (indexOf != -1) {
                    pvVar.b.x(indexOf, false);
                    return;
                }
            }
        }
    }

    @Override
    public final java.lang.CharSequence i(int r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lw.i(int):java.lang.CharSequence");
    }

    @Override
    public final int j() {
        return this.b.size();
    }
}
