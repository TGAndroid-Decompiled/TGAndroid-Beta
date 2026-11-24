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
public final class iw extends View implements fkb {
    public final ui5 a;
    public final ey b;
    public bx c;
    public bx d;
    public boolean e;
    public boolean f;
    public final ImageReceiver h;
    public zx n;
    public TLObject r;
    public final int s;
    public final int w;
    public int x;

    public iw(Activity activity, ui5 ui5Var, ey eyVar) {
        super(activity);
        this.s = gm.L(18.0f);
        this.w = gm.L(10.0f);
        this.a = ui5Var;
        this.b = eyVar;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.h = imageReceiver;
        imageReceiver.q0(gm.L(6.0f));
    }

    @Override
    public final void k(ArrayList arrayList) {
        bx bxVar = this.c;
        if (bxVar != null) {
            arrayList.add(bxVar);
        }
        bx bxVar2 = this.d;
        if (bxVar2 != null) {
            arrayList.add(bxVar2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bx bxVar = this.c;
        if (bxVar != null) {
            bxVar.i(this);
        }
        bx bxVar2 = this.d;
        if (bxVar2 != null) {
            bxVar2.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bx bxVar = this.c;
        if (bxVar != null) {
            bxVar.f(this);
        }
        bx bxVar2 = this.d;
        if (bxVar2 != null) {
            bxVar2.f(this);
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
            canvas.translate(this.s, gm.L(10.0f));
            bx bxVar = this.c;
            ui5 ui5Var = this.a;
            int i2 = 0;
            if (bxVar != null) {
                o.s(ui5Var, canvas, this, 0);
                this.c.d(canvas, this);
                i = 1;
            } else {
                i = 0;
            }
            float f = 0.0f;
            if (this.d != null) {
                canvas.translate(0.0f, this.x);
                o.s(ui5Var, canvas, this, i);
                this.d.d(canvas, this);
            }
            canvas.restore();
            if (this.e) {
                ey eyVar = this.b;
                if (eyVar == null || !eyVar.H) {
                    f = gm.L(17.0f);
                }
                float f2 = f;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (eyVar != null && eyVar.H) {
                    i2 = gm.L(17.0f);
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
        bx bxVar = this.c;
        ey eyVar = this.b;
        ui5 ui5Var = this.a;
        if (bxVar != null && (g2 = o.g(ui5Var, eyVar, bxVar)) != null) {
            spannableStringBuilder.append(g2);
        }
        bx bxVar2 = this.d;
        if (bxVar2 != null && (g = o.g(ui5Var, eyVar, bxVar2)) != null) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append(g);
        }
        if (spannableStringBuilder.length() == 0) {
            return;
        }
        spannableStringBuilder.append((CharSequence) ", ").append((CharSequence) jb6.M0(2131754857, null));
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
        zx zxVar = this.n;
        if (zxVar.b != zxVar.a.articles.size() - 1) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
        zx zxVar2 = this.n;
        TL_iv.pageRelatedArticle pagerelatedarticle = zxVar2.a.articles.get(zxVar2.b);
        int L2 = gm.L(gda.V0 - 16);
        long j = pagerelatedarticle.photo_id;
        int i8 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        ey eyVar = this.b;
        if (i8 != 0) {
            if (eyVar != null) {
                photo = dy.e(eyVar.F, j);
            } else {
                photo = dy.d(j, this.r);
            }
        } else {
            photo = null;
        }
        ImageReceiver imageReceiver2 = this.h;
        if (photo != null) {
            this.f = true;
            TLRPC.PhotoSize w = bc4.w(photo.sizes, gm.Y0(false), false, null, false);
            TLRPC.PhotoSize w2 = bc4.w(photo.sizes, 80, true, null, false);
            if (w == w2) {
                w2 = null;
            }
            imageReceiver2.Z(gn5.i(w, photo), "64_64", gn5.i(w2, photo), "64_64_b", null, w.size, null, this.r, 1);
            imageReceiver = imageReceiver2;
        } else {
            imageReceiver = imageReceiver2;
            this.f = false;
        }
        int L3 = gm.L(60.0f);
        int L4 = size - gm.L(36.0f);
        if (this.f) {
            float L5 = gm.L(44.0f);
            imageReceiver.i0((size - L) - gm.L(8.0f), gm.L(8.0f), L5, L5);
            L4 = (int) (L4 - (imageReceiver.N0 + gm.L(6.0f)));
        }
        int L6 = gm.L(18.0f);
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
        bx bxVar = this.c;
        int i9 = this.s;
        int i10 = this.w;
        if (bxVar != null) {
            int lineCount = bxVar.d.getLineCount();
            i6 = 4 - lineCount;
            this.x = hg9.v(f, this.c.d.getHeight(), L2);
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
            bx bxVar2 = this.c;
            bxVar2.s = i9;
            bxVar2.w = i10;
        } else {
            this.x = 0;
            i6 = 4;
            i7 = 0;
        }
        int i12 = i6;
        if (pagerelatedarticle.published_date != 0 && !TextUtils.isEmpty(pagerelatedarticle.author)) {
            String format = jb6.D0().h0().format(pagerelatedarticle.published_date * 1000);
            String str3 = pagerelatedarticle.author;
            Object[] objArr = new Object[2];
            objArr[0] = format;
            objArr[i5] = str3;
            str = jb6.a0(null, null, 2131754005, objArr);
        } else if (!TextUtils.isEmpty(pagerelatedarticle.author)) {
            Object[] objArr2 = new Object[i5];
            objArr2[0] = pagerelatedarticle.author;
            str = jb6.a0(null, null, 2131754021, objArr2);
        } else if (pagerelatedarticle.published_date != 0) {
            str = jb6.D0().h0().format(pagerelatedarticle.published_date * 1000);
        } else if (!TextUtils.isEmpty(pagerelatedarticle.description)) {
            str = pagerelatedarticle.description;
        } else {
            str = pagerelatedarticle.url;
        }
        int i13 = this.x + i10;
        String str4 = str;
        zx zxVar3 = this.n;
        if ((eyVar != null && eyVar.H) || i7 != 0) {
            alignment = oya.a();
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        bx n = o.n(this.a, this, str4, null, i4, i13, zxVar3, alignment, i12, this.b);
        this.d = n;
        if (n != null) {
            int height = n.d.getHeight() + L6;
            if (this.c != null) {
                height = hg9.v(f, L2, height);
            }
            L6 = height;
            bx bxVar3 = this.d;
            bxVar3.s = i9;
            bxVar3.w = i10 + this.x;
        }
        setMeasuredDimension(size, Math.max(i3, L6) + (this.e ? 1 : 0));
    }
}
