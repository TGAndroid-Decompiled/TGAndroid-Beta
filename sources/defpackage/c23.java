package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_phone;
public final class c23 extends mz0 {
    public final FrameLayout S1;
    public final b61 T1;
    public final b61 U1;
    public final ArrayList V1;
    public final HashSet W1;
    public boolean X1;
    public l7c Y1;

    public c23(Activity activity, HashSet hashSet) {
        super(activity, null, false, false, new r63());
        ArrayList arrayList = new ArrayList();
        this.V1 = arrayList;
        HashSet hashSet2 = new HashSet();
        this.W1 = hashSet2;
        arrayList.addAll(hashSet);
        hashSet2.addAll(hashSet);
        L(cmb.g5);
        this.s = false;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.S1 = frameLayout;
        LinearLayout l = td4.l(activity, 1);
        frameLayout.addView(l, qoe.e(-1, -1, 119));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(2131231273);
        imageView.setColorFilter(new PorterDuffColorFilter(-8090220, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, qoe.d(24, 24.0f, 53, 0.0f, 14.0f, 14.0f, 0.0f));
        rve.a(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final c23 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                c23 c23Var = this.b;
                switch (b) {
                    case 0:
                        c23Var.dismiss();
                        return;
                    case 1:
                        c23Var.Y0(false);
                        return;
                    default:
                        c23Var.Y0(true);
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(activity);
        int L = gm.L(80.0f);
        int i = cmb.Ei;
        ShapeDrawable K = cmb.K(L, cmb.v0(i, this.J0));
        wmb M = anb.M(i);
        ylb ylbVar = this.J0;
        frameLayout2.setBackground(K);
        anb.j(frameLayout2, K, M, null, ylbVar);
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(2131231094);
        frameLayout2.addView(imageView2, qoe.e(56, 56, 17));
        l.addView(frameLayout2, qoe.t(80, 80, 1, 2, 21, 2, 13));
        int i2 = cmb.F6;
        l66 a = jxe.a(activity, 20.0f, i2, true, this.J0);
        a.setText(jb6.M0(2131749240, null));
        a.setGravity(17);
        l.addView(a, qoe.t(-1, -2, 1, 2, 0, 2, 4));
        l66 a2 = jxe.a(activity, 14.0f, i2, false, this.J0);
        a2.setText(gm.S2(jb6.M0(2131749241, null)));
        a2.setGravity(17);
        a2.setMaxWidth(hg5.a(a2.getText(), a2.getPaint()));
        l.addView(a2, qoe.t(-1, -2, 1, 2, 0, 2, 23));
        l7c l7cVar = this.Y1;
        if (l7cVar != null) {
            l7cVar.O(false);
        }
        sc3 sc3Var = new sc3();
        sc3Var.m = false;
        sc3Var.C = false;
        sc3Var.o(d53.h);
        sc3Var.n(350L);
        this.n1.setItemAnimator(sc3Var);
        this.n1.setOnItemClickListener(new wm2(this, (byte) 7));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        LinearLayout l2 = td4.l(activity, 0);
        l2.setPadding(gm.L(14.0f) + this.u0, gm.L(14.0f), gm.L(14.0f) + this.u0, gm.L(14.0f));
        frameLayout3.addView(l2, qoe.e(-1, -2, 87));
        b61 b61Var = new b61(this.J0, activity, true);
        this.T1 = b61Var;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "x  ");
        spannableStringBuilder.setSpan(new pn2(2131232639, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) jb6.M0(2131749238, null));
        b61Var.i(spannableStringBuilder, false, true);
        l2.addView(b61Var, qoe.q(-1, 48, 1.0f, 119, 0, 0, 6, 0));
        b61Var.setOnClickListener(new View.OnClickListener(this) {
            public final c23 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                c23 c23Var = this.b;
                switch (b) {
                    case 0:
                        c23Var.dismiss();
                        return;
                    case 1:
                        c23Var.Y0(false);
                        return;
                    default:
                        c23Var.Y0(true);
                        return;
                }
            }
        });
        b61 b61Var2 = new b61(this.J0, activity, true);
        this.U1 = b61Var2;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "x  ");
        spannableStringBuilder2.setSpan(new pn2(2131232641, 0), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) jb6.M0(2131749239, null));
        b61Var2.i(spannableStringBuilder2, false, true);
        l2.addView(b61Var2, qoe.q(-1, 48, 1.0f, 119, 6, 0, 0, 0));
        b61Var2.setOnClickListener(new View.OnClickListener(this) {
            public final c23 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                c23 c23Var = this.b;
                switch (b) {
                    case 0:
                        c23Var.dismiss();
                        return;
                    case 1:
                        c23Var.Y0(false);
                        return;
                    default:
                        c23Var.Y0(true);
                        return;
                }
            }
        });
        this.b.addView(frameLayout3, qoe.e(-1, -2, 87));
        r59 r59Var = this.n1;
        int i3 = this.u0;
        r59Var.setPadding(i3, 0, i3, gm.L(76.0f));
    }

    @Override
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(r59Var, getContext(), this.a, 0, true, new h92(this, (byte) 14), this.J0);
        this.Y1 = l7cVar;
        return l7cVar;
    }

    @Override
    public final CharSequence J0() {
        return jb6.M0(2131749240, null);
    }

    public final void Y0(boolean z) {
        b61 b61Var;
        if (this.X1) {
            return;
        }
        this.X1 = true;
        if (z) {
            b61Var = this.U1;
        } else {
            b61Var = this.T1;
        }
        b61 b61Var2 = b61Var;
        b61Var2.setLoading(true);
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.W1);
        TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
        createconferencecall.random_id = Utilities.b.nextInt();
        ConnectionsManager.getInstance(this.a).sendRequest(createconferencecall, new rj1(this, b61Var2, z, hashSet, (byte) 3));
    }
}
