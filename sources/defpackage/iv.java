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
public final class iv extends View implements eib {
    public final vg5 a;
    public final dx b;
    public bw c;
    public bw d;
    public boolean e;
    public boolean f;
    public final ImageReceiver h;
    public zw n;
    public TLObject r;
    public final int s;
    public final int w;
    public int x;

    public iv(Activity activity, vg5 vg5Var, dx dxVar) {
        super(activity);
        this.s = gl.L(18.0f);
        this.w = gl.L(10.0f);
        this.a = vg5Var;
        this.b = dxVar;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.h = imageReceiver;
        imageReceiver.q0(gl.L(6.0f));
    }

    @Override
    public final void k(ArrayList arrayList) {
        bw bwVar = this.c;
        if (bwVar != null) {
            arrayList.add(bwVar);
        }
        bw bwVar2 = this.d;
        if (bwVar2 != null) {
            arrayList.add(bwVar2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bw bwVar = this.c;
        if (bwVar != null) {
            bwVar.i(this);
        }
        bw bwVar2 = this.d;
        if (bwVar2 != null) {
            bwVar2.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bw bwVar = this.c;
        if (bwVar != null) {
            bwVar.f(this);
        }
        bw bwVar2 = this.d;
        if (bwVar2 != null) {
            bwVar2.f(this);
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
            canvas.translate(this.s, gl.L(10.0f));
            bw bwVar = this.c;
            vg5 vg5Var = this.a;
            int i2 = 0;
            if (bwVar != null) {
                o.s(vg5Var, canvas, this, 0);
                this.c.d(canvas, this);
                i = 1;
            } else {
                i = 0;
            }
            float f = 0.0f;
            if (this.d != null) {
                canvas.translate(0.0f, this.x);
                o.s(vg5Var, canvas, this, i);
                this.d.d(canvas, this);
            }
            canvas.restore();
            if (this.e) {
                dx dxVar = this.b;
                if (dxVar == null || !dxVar.H) {
                    f = gl.L(17.0f);
                }
                float f2 = f;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (dxVar != null && dxVar.H) {
                    i2 = gl.L(17.0f);
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
        bw bwVar = this.c;
        dx dxVar = this.b;
        vg5 vg5Var = this.a;
        if (bwVar != null && (g2 = o.g(vg5Var, dxVar, bwVar)) != null) {
            spannableStringBuilder.append(g2);
        }
        bw bwVar2 = this.d;
        if (bwVar2 != null && (g = o.g(vg5Var, dxVar, bwVar2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(g);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) k96.M0(2131754857, null));
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
        zw zwVar = this.n;
        if (zwVar.b != zwVar.a.articles.size() - 1) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
        zw zwVar2 = this.n;
        TL_iv.pageRelatedArticle pagerelatedarticle = zwVar2.a.articles.get(zwVar2.b);
        int L2 = gl.L(gba.V0 - 16);
        long j = pagerelatedarticle.photo_id;
        int i8 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        dx dxVar = this.b;
        if (i8 != 0) {
            if (dxVar != null) {
                photo = cx.e(dxVar.F, j);
            } else {
                photo = cx.d(j, this.r);
            }
        } else {
            photo = null;
        }
        ImageReceiver imageReceiver2 = this.h;
        if (photo != null) {
            this.f = true;
            TLRPC.PhotoSize w = ba4.w(photo.sizes, gl.Y0(false), false, null, false);
            TLRPC.PhotoSize w2 = ba4.w(photo.sizes, 80, true, null, false);
            if (w == w2) {
                w2 = null;
            }
            imageReceiver2.Z(gl5.i(w, photo), "64_64", gl5.i(w2, photo), "64_64_b", null, w.size, null, this.r, 1);
            imageReceiver = imageReceiver2;
        } else {
            imageReceiver = imageReceiver2;
            this.f = false;
        }
        int L3 = gl.L(60.0f);
        int L4 = size - gl.L(36.0f);
        if (this.f) {
            float L5 = gl.L(44.0f);
            imageReceiver.i0((size - L) - gl.L(8.0f), gl.L(8.0f), L5, L5);
            L4 = (int) (L4 - (imageReceiver.N0 + gl.L(6.0f)));
        }
        int L6 = gl.L(18.0f);
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
        bw bwVar = this.c;
        int i9 = this.s;
        int i10 = this.w;
        if (bwVar != null) {
            int lineCount = bwVar.d.getLineCount();
            i6 = 4 - lineCount;
            this.x = de9.w(f, this.c.d.getHeight(), L2);
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
            bw bwVar2 = this.c;
            bwVar2.s = i9;
            bwVar2.w = i10;
        } else {
            this.x = 0;
            i6 = 4;
            i7 = 0;
        }
        int i12 = i6;
        if (pagerelatedarticle.published_date != 0 && !TextUtils.isEmpty(pagerelatedarticle.author)) {
            String format = k96.D0().h0().format(pagerelatedarticle.published_date * 1000);
            String str3 = pagerelatedarticle.author;
            Object[] objArr = new Object[2];
            objArr[0] = format;
            objArr[i5] = str3;
            str = k96.a0(null, null, 2131754037, objArr);
        } else if (!TextUtils.isEmpty(pagerelatedarticle.author)) {
            Object[] objArr2 = new Object[i5];
            objArr2[0] = pagerelatedarticle.author;
            str = k96.a0(null, null, 2131754053, objArr2);
        } else if (pagerelatedarticle.published_date != 0) {
            str = k96.D0().h0().format(pagerelatedarticle.published_date * 1000);
        } else if (!TextUtils.isEmpty(pagerelatedarticle.description)) {
            str = pagerelatedarticle.description;
        } else {
            str = pagerelatedarticle.url;
        }
        int i13 = this.x + i10;
        String str4 = str;
        zw zwVar3 = this.n;
        if ((dxVar != null && dxVar.H) || i7 != 0) {
            alignment = lwa.a();
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        bw n = o.n(this.a, this, str4, null, i4, i13, zwVar3, alignment, i12, this.b);
        this.d = n;
        if (n != null) {
            int height = n.d.getHeight() + L6;
            if (this.c != null) {
                height = de9.w(f, L2, height);
            }
            L6 = height;
            bw bwVar3 = this.d;
            bwVar3.s = i9;
            bwVar3.w = i10 + this.x;
        }
        setMeasuredDimension(size, Math.max(i3, L6) + (this.e ? 1 : 0));
    }
}
