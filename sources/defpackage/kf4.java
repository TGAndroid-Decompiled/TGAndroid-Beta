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
import org.telegram.ui.ActionBar.d;
public abstract class kf4 extends FrameLayout implements vlb {
    public TL_chatlists.TL_exportedChatlistInvite E;
    public final d a;
    public final int b;
    public final int c;
    public final Drawable d;
    public final Drawable e;
    public final io f;
    public final io h;
    public final Paint n;
    public final Paint r;
    public float s;
    public boolean w;
    public ValueAnimator x;
    public String y;

    public kf4(Context context, d dVar, int i, int i2) {
        super(context);
        int i3;
        float f;
        float f2;
        int i4;
        float f3;
        float f4;
        float f5;
        float f6;
        this.a = dVar;
        this.b = i;
        this.c = i2;
        setImportantForAccessibility(1);
        io ioVar = new io(context, true, true, false);
        this.f = ioVar;
        ioVar.setTextSize(gm.L(15.66f));
        anb.U(ioVar, cmb.F6, null);
        if (jb6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        ioVar.setGravity(i3);
        ioVar.setEllipsizeByGradient(true);
        boolean z = jb6.a0;
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
        addView(ioVar, qoe.d(-1, 20.0f, 55, f, 10.33f, f2, 0.0f));
        io ioVar2 = new io(context, false, false, false);
        this.h = ioVar2;
        ioVar2.setTextSize(gm.L(13.0f));
        anb.U(ioVar2, cmb.y6, null);
        if (jb6.a0) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        ioVar2.setGravity(i4);
        boolean z2 = jb6.a0;
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
        addView(ioVar2, qoe.d(-1, 16.0f, 55, f3, 33.33f, f4, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(getContext().getResources().getDrawable(2131231248));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i5 = cmb.h6;
        fg0 f0 = cmb.f0(cmb.w0(null, i5, false), 1, -1);
        wmb M = anb.M(i5);
        imageView.setBackground(f0);
        anb.j(imageView, f0, null, M, null);
        int i6 = cmb.Ki;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        anb.s(imageView, i6, null, mode);
        imageView.setOnClickListener(new sf3(this, (byte) 15));
        imageView.setContentDescription(jb6.M0(2131754838, null));
        boolean z3 = jb6.a0;
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
        addView(imageView, qoe.d(40, 40.0f, i7, f5, 4.0f, f6, 4.0f));
        Paint paint = new Paint();
        this.n = paint;
        paint.setColor(cmb.w0(null, cmb.Ei, false));
        Paint paint2 = new Paint();
        this.r = paint2;
        paint2.setColor(cmb.w0(null, cmb.mk, false));
        Drawable mutate = getContext().getResources().getDrawable(2131232211).mutate();
        this.d = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(2131232212).mutate();
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
        hf4 hf4Var = new hf4(this, (byte) 2);
        ConnectionsManager.getInstance(this.b).sendRequest(tL_chatlists_deleteExportedInvite, new cx3(this, hf4Var, (byte) 3));
        gm.d3(hf4Var, 150L);
    }

    public abstract void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite);

    public void c() {
        d dVar = this.a;
        if (!(dVar instanceof qf4)) {
            return;
        }
        fv fvVar = ((qf4) dVar).a;
        bu5 I = bu5.I(dVar, this);
        I.X(fvVar.V0(this, false));
        I.b(2131232326, jb6.M0(2131750405, null), new hf4(this, (byte) 0), false);
        I.b(2131232114, jb6.M0(2131751471, null), new hf4(this, (byte) 1), true);
        if (jb6.a0) {
            I.i = (byte) 3;
        }
        I.a0();
    }

    public final void d() {
        if (this.y == null) {
            return;
        }
        ax8 ax8Var = new ax8(getContext(), jb6.M0(2131748927, null), this.y, jb6.M0(2131746239, null), false);
        ax8Var.D0();
        ax8Var.show();
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
        io ioVar = this.f;
        if (isEmpty) {
            ioVar.c(str, z2, true);
        } else {
            ioVar.c(tL_exportedChatlistInvite.title, z2, true);
        }
        this.h.c(jb6.G(tL_exportedChatlistInvite.peers.size(), "FilterInviteChats", new Object[0]), z2, true);
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
                ofFloat.addUpdateListener(new et1(this, (byte) 27));
                this.x.addListener(new jf4((byte) 0, this, z3));
                this.x.setInterpolator(d53.h);
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
        if (jb6.a0) {
            L = getMeasuredWidth() - gm.L(32.0f);
        } else {
            L = gm.L(32.0f);
        }
        float f = L;
        canvas.drawCircle(f, getMeasuredHeight() / 2.0f, gm.L(16.0f), this.n);
        float f2 = 0.0f;
        if (this.s > 0.0f) {
            canvas.drawCircle(f, getMeasuredHeight() / 2.0f, gm.L(16.0f) * this.s, this.r);
        }
        float f3 = this.s;
        if (f3 < 1.0f) {
            Drawable drawable = this.d;
            drawable.setAlpha((int) ((1.0f - f3) * 255.0f));
            drawable.setBounds(L - gm.L(14.0f), (getMeasuredHeight() / 2) - gm.L(14.0f), gm.L(14.0f) + L, gm.L(14.0f) + (getMeasuredHeight() / 2));
            drawable.draw(canvas);
        }
        float f4 = this.s;
        if (f4 > 0.0f) {
            Drawable drawable2 = this.e;
            drawable2.setAlpha((int) (f4 * 255.0f));
            drawable2.setBounds(L - gm.L(14.0f), (getMeasuredHeight() / 2) - gm.L(14.0f), gm.L(14.0f) + L, gm.L(14.0f) + (getMeasuredHeight() / 2));
            drawable2.draw(canvas);
        }
        if (this.w) {
            if (!jb6.a0) {
                f2 = gm.L(64.0f);
            }
            float f5 = f2;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (jb6.a0) {
                i = gm.L(64.0f);
            } else {
                i = 0;
            }
            canvas.drawRect(f5, measuredHeight, measuredWidth - i, getMeasuredHeight(), cmb.j0);
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
            str = b10.j(new StringBuilder(), this.E.title, "\n ");
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(jb6.M0(2131748906, null));
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(60.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            this.n.setColor(cmb.w0(null, cmb.Ei, false));
            this.r.setColor(cmb.w0(null, cmb.mk, false));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
