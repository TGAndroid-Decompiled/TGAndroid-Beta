package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;
public final class jv extends View implements zlb {
    public final xi5 a;
    public final ex b;
    public cw c;
    public cw d;
    public boolean e;
    public boolean f;
    public final ImageReceiver h;
    public ax n;
    public TLObject r;
    public final int s;
    public final int w;
    public int x;

    public jv(Activity activity, xi5 xi5Var, ex exVar) {
        super(activity);
        this.s = hl.L(18.0f);
        this.w = hl.L(10.0f);
        this.a = xi5Var;
        this.b = exVar;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.h = imageReceiver;
        imageReceiver.q0(hl.L(6.0f));
    }

    @Override
    public final void k(ArrayList arrayList) {
        cw cwVar = this.c;
        if (cwVar != null) {
            arrayList.add(cwVar);
        }
        cw cwVar2 = this.d;
        if (cwVar2 != null) {
            arrayList.add(cwVar2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cw cwVar = this.c;
        if (cwVar != null) {
            cwVar.i(this);
        }
        cw cwVar2 = this.d;
        if (cwVar2 != null) {
            cwVar2.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cw cwVar = this.c;
        if (cwVar != null) {
            cwVar.f(this);
        }
        cw cwVar2 = this.d;
        if (cwVar2 != null) {
            cwVar2.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        if (this.n != null) {
            if (this.f) {
                this.h.h(canvas, null);
            }
            canvas.save();
            canvas.translate(this.s, hl.L(10.0f));
            cw cwVar = this.c;
            xi5 xi5Var = this.a;
            int i2 = 0;
            if (cwVar != null) {
                o.s(xi5Var, canvas, this, 0);
                this.c.d(canvas, this);
                i = 1;
            } else {
                i = 0;
            }
            float f = 0.0f;
            if (this.d != null) {
                canvas.translate(0.0f, this.x);
                o.s(xi5Var, canvas, this, i);
                this.d.d(canvas, this);
            }
            canvas.restore();
            if (this.e) {
                ex exVar = this.b;
                if (exVar == null || !exVar.H) {
                    f = hl.L(17.0f);
                }
                float f2 = f;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (exVar != null && exVar.H) {
                    i2 = hl.L(17.0f);
                }
                canvas.drawLine(f2, measuredHeight, measuredWidth - i2, getMeasuredHeight() - 1, o.t1);
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence g;
        CharSequence g2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        cw cwVar = this.c;
        ex exVar = this.b;
        xi5 xi5Var = this.a;
        if (cwVar != null && (g2 = o.g(xi5Var, exVar, cwVar)) != null) {
            spannableStringBuilder.append(g2);
        }
        cw cwVar2 = this.d;
        if (cwVar2 != null && (g = o.g(xi5Var, exVar, cwVar2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(g);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) ob6.M0(2131754853, null));
        accessibilityNodeInfo.setText(spannableStringBuilder);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z;
        TLRPC.Photo photo;
        ImageReceiver imageReceiver;
        int i3;
        int i4;
        int i5;
        float f;
        int i6;
        int i7;
        String str;
        Layout.Alignment alignment;
        int L;
        int size = View.MeasureSpec.getSize(i);
        ax axVar = this.n;
        if (axVar.b != axVar.a.articles.size() - 1) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
        ax axVar2 = this.n;
        TL_iv.pageRelatedArticle pagerelatedarticle = axVar2.a.articles.get(axVar2.b);
        int L2 = hl.L(xea.V0 - 16);
        long j = pagerelatedarticle.photo_id;
        int i8 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        ex exVar = this.b;
        if (i8 != 0) {
            if (exVar != null) {
                photo = dx.e(exVar.F, j);
            } else {
                photo = dx.d(j, this.r);
            }
        } else {
            photo = null;
        }
        ImageReceiver imageReceiver2 = this.h;
        if (photo != null) {
            this.f = true;
            TLRPC.PhotoSize w = xb4.w(photo.sizes, hl.Y0(false), false, null, false);
            TLRPC.PhotoSize w2 = xb4.w(photo.sizes, 80, true, null, false);
            if (w == w2) {
                w2 = null;
            }
            imageReceiver2.Z(jn5.i(w, photo), "64_64", jn5.i(w2, photo), "64_64_b", null, w.size, null, this.r, 1);
            imageReceiver = imageReceiver2;
        } else {
            imageReceiver = imageReceiver2;
            this.f = false;
        }
        int L3 = hl.L(60.0f);
        int L4 = size - hl.L(36.0f);
        if (this.f) {
            float L5 = hl.L(44.0f);
            imageReceiver.i0((size - L) - hl.L(8.0f), hl.L(8.0f), L5, L5);
            L4 = (int) (L4 - (imageReceiver.N0 + hl.L(6.0f)));
        }
        int L6 = hl.L(18.0f);
        String str2 = pagerelatedarticle.title;
        if (str2 != null) {
            i4 = L4;
            i5 = 1;
            i3 = L3;
            f = 6.0f;
            this.c = o.n(this.a, this, str2, null, i4, this.w, this.n, Layout.Alignment.ALIGN_NORMAL, 3, this.b);
        } else {
            i3 = L3;
            i4 = L4;
            i5 = 1;
            f = 6.0f;
        }
        cw cwVar = this.c;
        int i9 = this.s;
        int i10 = this.w;
        if (cwVar != null) {
            int lineCount = cwVar.d.getLineCount();
            i6 = 4 - lineCount;
            this.x = uh9.w(f, this.c.d.getHeight(), L2);
            L6 = this.c.d.getHeight() + L6;
            int i11 = 0;
            while (true) {
                if (i11 < lineCount) {
                    if (this.c.d.getLineLeft(i11) != 0.0f) {
                        i7 = i5;
                        break;
                    }
                    i11++;
                } else {
                    i7 = 0;
                    break;
                }
            }
            cw cwVar2 = this.c;
            cwVar2.s = i9;
            cwVar2.w = i10;
        } else {
            this.x = 0;
            i6 = 4;
            i7 = 0;
        }
        int i12 = i6;
        if (pagerelatedarticle.published_date != 0 && !TextUtils.isEmpty(pagerelatedarticle.author)) {
            String format = ob6.D0().h0().format(pagerelatedarticle.published_date * 1000);
            String str3 = pagerelatedarticle.author;
            Object[] objArr = new Object[2];
            objArr[0] = format;
            objArr[i5] = str3;
            str = ob6.a0(null, null, 2131754033, objArr);
        } else if (!TextUtils.isEmpty(pagerelatedarticle.author)) {
            Object[] objArr2 = new Object[i5];
            objArr2[0] = pagerelatedarticle.author;
            str = ob6.a0(null, null, 2131754049, objArr2);
        } else if (pagerelatedarticle.published_date != 0) {
            str = ob6.D0().h0().format(pagerelatedarticle.published_date * 1000);
        } else if (!TextUtils.isEmpty(pagerelatedarticle.description)) {
            str = pagerelatedarticle.description;
        } else {
            str = pagerelatedarticle.url;
        }
        int i13 = this.x + i10;
        String str4 = str;
        ax axVar3 = this.n;
        if ((exVar != null && exVar.H) || i7 != 0) {
            alignment = o0b.a();
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        cw n = o.n(this.a, this, str4, null, i4, i13, axVar3, alignment, i12, this.b);
        this.d = n;
        if (n != null) {
            int height = n.d.getHeight() + L6;
            if (this.c != null) {
                height = uh9.w(f, L2, height);
            }
            L6 = height;
            cw cwVar3 = this.d;
            cwVar3.s = i9;
            cwVar3.w = i10 + this.x;
        }
        setMeasuredDimension(size, Math.max(i3, L6) + (this.e ? 1 : 0));
    }
}
