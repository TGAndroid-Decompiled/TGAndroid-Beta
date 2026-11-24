package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.SessionsActivity;
public final class i9a extends FrameLayout implements vlb, jm7 {
    public final bf0 a;
    public final ey0 b;
    public final ef1 c;
    public int d;
    public int e;
    public final SessionsActivity f;

    public i9a(SessionsActivity sessionsActivity, Context context) {
        super(context);
        this.f = sessionsActivity;
        ef1 ef1Var = new ef1();
        this.c = ef1Var;
        bf0 bf0Var = new bf0(context);
        this.a = bf0Var;
        addView(bf0Var, qoe.d(120, 120.0f, 1, 0.0f, 16.0f, 0.0f, 0.0f));
        ef1Var.j = false;
        ef1Var.n = 1.2f;
        bf0Var.setOnClickListener(new g6(this, (byte) 14));
        int i = cmb.F6;
        cmb.w0(null, i, false);
        int i2 = cmb.c6;
        cmb.w0(null, i2, false);
        int i3 = cmb.Ei;
        cmb.w0(null, i3, false);
        cmb.w0(null, i2, false);
        l66 l66Var = new l66(context, null);
        addView(l66Var, qoe.d(-1, -2.0f, 0, 36.0f, 152.0f, 36.0f, 0.0f));
        l66Var.setGravity(1);
        anb.X(l66Var, i, null);
        l66Var.setTextSize(1, 15.0f);
        anb.G(l66Var, cmb.I6, null);
        anb.C(l66Var, cmb.J6, null);
        String M0 = jb6.M0(2131753854, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
        int indexOf = M0.indexOf(42);
        int i4 = indexOf + 1;
        int indexOf2 = M0.indexOf(42, i4);
        if (indexOf != -1 && indexOf2 != -1 && indexOf != indexOf2) {
            l66Var.setMovementMethod(new cm((byte) 0));
            spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, i4, (CharSequence) "");
            spannableStringBuilder.setSpan(new g6c(jb6.M0(2131753858, null), (wkb) null), indexOf, indexOf2 - 1, 33);
        }
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        int indexOf3 = spannableStringBuilder2.indexOf(42);
        int i5 = indexOf3 + 1;
        int indexOf4 = spannableStringBuilder2.indexOf(42, i5);
        if (indexOf3 != -1 && indexOf4 != -1 && indexOf3 != indexOf4) {
            l66Var.setMovementMethod(new cm((byte) 0));
            spannableStringBuilder.replace(indexOf4, indexOf4 + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf3, i5, (CharSequence) "");
            spannableStringBuilder.setSpan(new g6c(jb6.M0(2131753848, null), (wkb) null), indexOf3, indexOf4 - 1, 33);
        }
        l66Var.setText(spannableStringBuilder);
        ey0 ey0Var = new ey0((byte) 5, context, this);
        this.b = ey0Var;
        ey0Var.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
        ey0Var.setGravity(17);
        ey0Var.setTextSize(1, 14.0f);
        ey0Var.setTypeface(gm.o());
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) ".  ").append((CharSequence) jb6.M0(2131748674, null));
        spannableStringBuilder3.setSpan(new pn2(0, getContext().getDrawable(2131232252)), 0, 1, 0);
        ey0Var.setText(spannableStringBuilder3);
        anb.X(ey0Var, cmb.Ii, null);
        int L = gm.L(24.0f);
        int w0 = cmb.w0(null, i3, false);
        int w02 = cmb.w0(null, cmb.Gi, false);
        ey0Var.setBackground(cmb.i0(L, L, L, L, w0, w02, w02));
        ey0Var.setOnClickListener(new wk8(this, (byte) 26));
        addView(ey0Var, qoe.d(-1, 48.0f, 80, 16.0f, 15.0f, 16.0f, 16.0f));
        a();
    }

    public final void a() {
        int i;
        TLRPC.Document document;
        int i2;
        boolean z;
        int i3;
        SessionsActivity sessionsActivity = this.f;
        i = ((d) sessionsActivity).currentAccount;
        TLRPC.TL_messages_stickerSet q0 = hs6.d0(i).q0("tg_placeholders_android");
        if (q0 == null) {
            i3 = ((d) sessionsActivity).currentAccount;
            q0 = hs6.d0(i3).o0("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = q0;
        meb mebVar = null;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() > 6) {
            document = tL_messages_stickerSet.documents.get(6);
        } else {
            document = null;
        }
        if (document != null) {
            mebVar = eq3.d(document.thumbs, cmb.b7, 0.2f, false);
        }
        meb mebVar2 = mebVar;
        if (mebVar2 != null) {
            mebVar2.e = 512;
            mebVar2.f = 512;
        }
        if (document == null) {
            i2 = ((d) sessionsActivity).currentAccount;
            hs6 d0 = hs6.d0(i2);
            if (tL_messages_stickerSet == null) {
                z = true;
            } else {
                z = false;
            }
            d0.d1("tg_placeholders_android", false, z);
            return;
        }
        gn5 b = gn5.b(document);
        bf0 bf0Var = this.a;
        bf0Var.n(b, "130_130", "tgs", mebVar2, tL_messages_stickerSet);
        bf0Var.getImageReceiver().M(2);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.y0 && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        a();
        i = ((d) this.f).currentAccount;
        nm7.f(i).b(this, nm7.y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        int i;
        super.onDetachedFromWindow();
        i = ((d) this.f).currentAccount;
        nm7.f(i).n(this, nm7.y0);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(276.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            int w0 = cmb.w0(null, cmb.Ei, false);
            int w02 = cmb.w0(null, cmb.Gi, false);
            ey0 ey0Var = this.b;
            if (ey0Var != null && (w0 != this.d || w02 != this.e)) {
                this.d = w0;
                this.e = w02;
                int L = gm.L(24.0f);
                ey0Var.setBackground(cmb.i0(L, L, L, L, w0, w02, w02));
            }
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
