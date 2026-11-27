package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.e;
public abstract class hf4 extends FrameLayout implements snb {
    public TL_chatlists.TL_exportedChatlistInvite E;
    public final e a;
    public final int b;
    public final int c;
    public final Drawable d;
    public final Drawable e;
    public final in f;
    public final in h;
    public final Paint n;
    public final Paint r;
    public float s;
    public boolean w;
    public ValueAnimator x;
    public String y;

    public hf4(Context context, e eVar, int i, int i2) {
        super(context);
        int i3;
        float f;
        float f2;
        int i4;
        float f3;
        float f4;
        float f5;
        float f6;
        this.a = eVar;
        this.b = i;
        this.c = i2;
        setImportantForAccessibility(1);
        in inVar = new in(context, true, true, false);
        this.f = inVar;
        inVar.setTextSize(hl.L(15.66f));
        yob.U(inVar, aob.G6, null);
        if (ob6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        inVar.setGravity(i3);
        inVar.setEllipsizeByGradient(true);
        boolean z = ob6.a0;
        if (z) {
            f = 56.0f;
        } else {
            f = 64.0f;
        }
        if (z) {
            f2 = 64.0f;
        } else {
            f2 = 56.0f;
        }
        addView(inVar, tre.d(-1, 20.0f, 55, f, 10.33f, f2, 0.0f));
        in inVar2 = new in(context, false, false, false);
        this.h = inVar2;
        inVar2.setTextSize(hl.L(13.0f));
        yob.U(inVar2, aob.z6, null);
        if (ob6.a0) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        inVar2.setGravity(i4);
        boolean z2 = ob6.a0;
        if (z2) {
            f3 = 56.0f;
        } else {
            f3 = 64.0f;
        }
        if (z2) {
            f4 = 64.0f;
        } else {
            f4 = 56.0f;
        }
        addView(inVar2, tre.d(-1, 16.0f, 55, f3, 33.33f, f4, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(getContext().getResources().getDrawable(2131231247));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i5 = aob.i6;
        hf0 f0 = aob.f0(aob.w0(null, i5, false), 1, -1);
        uob M = yob.M(i5);
        imageView.setBackground(f0);
        yob.j(imageView, f0, null, M, null);
        int i6 = aob.Li;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        yob.s(imageView, i6, null, mode);
        imageView.setOnClickListener(new mh3(this, (byte) 14));
        imageView.setContentDescription(ob6.M0(2131754834, null));
        boolean z3 = ob6.a0;
        int i7 = (z3 ? 3 : 5) | 16;
        if (z3) {
            f5 = 8.0f;
        } else {
            f5 = 4.0f;
        }
        if (z3) {
            f6 = 4.0f;
        } else {
            f6 = 8.0f;
        }
        addView(imageView, tre.d(40, 40.0f, i7, f5, 4.0f, f6, 4.0f));
        Paint paint = new Paint();
        this.n = paint;
        paint.setColor(aob.w0(null, aob.Fi, false));
        Paint paint2 = new Paint();
        this.r = paint2;
        paint2.setColor(aob.w0(null, aob.nk, false));
        Drawable mutate = getContext().getResources().getDrawable(2131232210).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(2131232211).mutate();
        this.e = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        setWillNotDraw(false);
    }

    public final void a() {
        String substring;
        String str = this.y;
        if (str == null) {
            substring = null;
        } else {
            substring = str.substring(str.lastIndexOf(47) + 1);
        }
        if (substring == null) {
            return;
        }
        TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = this.c;
        tL_chatlists_deleteExportedInvite.slug = substring;
        ff4 ff4Var = new ff4(this, (byte) 2);
        ConnectionsManager.getInstance(this.b).sendRequest(tL_chatlists_deleteExportedInvite, new mw3(this, ff4Var, (byte) 3));
        hl.d3(ff4Var, 150L);
    }

    public abstract void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite);

    public void c() {
        e eVar = this.a;
        if (!(eVar instanceof nf4)) {
            return;
        }
        gu guVar = ((nf4) eVar).a;
        fu5 I = fu5.I(eVar, this);
        I.X(guVar.W0(this, false));
        I.b(2131232325, ob6.M0(2131750433, null), new ff4(this, (byte) 0), false);
        I.b(2131232113, ob6.M0(2131751499, null), new ff4(this, (byte) 1), true);
        if (ob6.a0) {
            I.i = (byte) 3;
        }
        I.a0();
    }

    public final void d() {
        if (this.y == null) {
            return;
        }
        ky8 ky8Var = new ky8(getContext(), ob6.M0(2131748924, null), this.y, ob6.M0(2131746233, null), false);
        ky8Var.E0();
        ky8Var.show();
    }

    public final void e(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite, boolean z) {
        boolean z2;
        if (this.E == tL_exportedChatlistInvite) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.E = tL_exportedChatlistInvite;
        String str = tL_exportedChatlistInvite.url;
        this.y = str;
        if (str.startsWith("http://")) {
            str = str.substring(7);
        }
        if (str.startsWith("https://")) {
            str = str.substring(8);
        }
        boolean isEmpty = TextUtils.isEmpty(tL_exportedChatlistInvite.title);
        in inVar = this.f;
        if (isEmpty) {
            inVar.c(str, z2, true);
        } else {
            inVar.c(tL_exportedChatlistInvite.title, z2, true);
        }
        this.h.c(ob6.G(tL_exportedChatlistInvite.peers.size(), "FilterInviteChats", new Object[0]), z2, true);
        if (this.w != z) {
            this.w = z;
            invalidate();
        }
        boolean z3 = tL_exportedChatlistInvite.revoked;
        if ((z3 ? 1.0f : 0.0f) != this.s) {
            ValueAnimator valueAnimator = this.x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.x = null;
            }
            float f = 0.0f;
            if (z2) {
                float f2 = this.s;
                if (z3) {
                    f = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                this.x = ofFloat;
                ofFloat.addUpdateListener(new az1(this, (byte) 27));
                this.x.addListener(new gf4((byte) 0, this, z3));
                this.x.setInterpolator(k43.h);
                this.x.setDuration(350L);
                this.x.start();
                return;
            }
            if (z3) {
                f = 1.0f;
            }
            this.s = f;
            invalidate();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        int i;
        super.onDraw(canvas);
        if (ob6.a0) {
            L = getMeasuredWidth() - hl.L(32.0f);
        } else {
            L = hl.L(32.0f);
        }
        float f = L;
        canvas.drawCircle(f, getMeasuredHeight() / 2.0f, hl.L(16.0f), this.n);
        float f2 = 0.0f;
        if (this.s > 0.0f) {
            canvas.drawCircle(f, getMeasuredHeight() / 2.0f, hl.L(16.0f) * this.s, this.r);
        }
        float f3 = this.s;
        if (f3 < 1.0f) {
            Drawable drawable = this.d;
            drawable.setAlpha((int) ((1.0f - f3) * 255.0f));
            drawable.setBounds(L - hl.L(14.0f), (getMeasuredHeight() / 2) - hl.L(14.0f), hl.L(14.0f) + L, hl.L(14.0f) + (getMeasuredHeight() / 2));
            drawable.draw(canvas);
        }
        float f4 = this.s;
        if (f4 > 0.0f) {
            Drawable drawable2 = this.e;
            drawable2.setAlpha((int) (f4 * 255.0f));
            drawable2.setBounds(L - hl.L(14.0f), (getMeasuredHeight() / 2) - hl.L(14.0f), hl.L(14.0f) + L, hl.L(14.0f) + (getMeasuredHeight() / 2));
            drawable2.draw(canvas);
        }
        if (this.w) {
            if (!ob6.a0) {
                f2 = hl.L(64.0f);
            }
            float f5 = f2;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (ob6.a0) {
                i = hl.L(64.0f);
            } else {
                i = 0;
            }
            canvas.drawRect(f5, measuredHeight, measuredWidth - i, getMeasuredHeight(), aob.j0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.E;
        String str2 = "";
        if (tL_exportedChatlistInvite == null || TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
            str = "";
        } else {
            str = c00.k(new StringBuilder(), this.E.title, "\n ");
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(ob6.M0(2131748903, null));
        sb.append(", ");
        sb.append((Object) this.h.getText());
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2 = this.E;
        if (tL_exportedChatlistInvite2 != null && TextUtils.isEmpty(tL_exportedChatlistInvite2.title)) {
            str2 = "\n\n" + this.E.url;
        }
        sb.append(str2);
        accessibilityNodeInfo.setContentDescription(sb.toString());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(60.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.n.setColor(aob.w0(null, aob.Fi, false));
            this.r.setColor(aob.w0(null, aob.nk, false));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
