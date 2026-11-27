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
public final class j13 extends ny0 {
    public final FrameLayout S1;
    public final c51 T1;
    public final c51 U1;
    public final ArrayList V1;
    public final HashSet W1;
    public boolean X1;
    public l9c Y1;

    public j13(Activity activity, HashSet hashSet) {
        super(activity, null, false, false, new x53());
        ArrayList arrayList = new ArrayList();
        this.V1 = arrayList;
        HashSet hashSet2 = new HashSet();
        this.W1 = hashSet2;
        arrayList.addAll(hashSet);
        hashSet2.addAll(hashSet);
        L(aob.h5);
        this.s = false;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.S1 = frameLayout;
        LinearLayout m = bs2.m(activity, 1);
        frameLayout.addView(m, tre.e(-1, -1, 119));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(2131231272);
        imageView.setColorFilter(new PorterDuffColorFilter(-8090220, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, tre.d(24, 24.0f, 53, 0.0f, 14.0f, 14.0f, 0.0f));
        iye.a(imageView);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final j13 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                j13 j13Var = this.b;
                switch (b) {
                    case 0:
                        j13Var.dismiss();
                        return;
                    case 1:
                        j13Var.Z0(false);
                        return;
                    default:
                        j13Var.Z0(true);
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(activity);
        int L = hl.L(80.0f);
        int i = aob.Fi;
        ShapeDrawable K = aob.K(L, aob.v0(i, this.J0));
        uob M = yob.M(i);
        vnb vnbVar = this.J0;
        frameLayout2.setBackground(K);
        yob.j(frameLayout2, K, M, null, vnbVar);
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(2131231093);
        frameLayout2.addView(imageView2, tre.e(56, 56, 17));
        m.addView(frameLayout2, tre.t(80, 80, 1, 2, 21, 2, 13));
        int i2 = aob.G6;
        p66 a = zze.a(activity, 20.0f, i2, true, this.J0);
        a.setText(ob6.M0(2131749237, null));
        a.setGravity(17);
        m.addView(a, tre.t(-1, -2, 1, 2, 0, 2, 4));
        p66 a2 = zze.a(activity, 14.0f, i2, false, this.J0);
        a2.setText(hl.S2(ob6.M0(2131749238, null)));
        a2.setGravity(17);
        a2.setMaxWidth(kg5.a(a2.getText(), a2.getPaint()));
        m.addView(a2, tre.t(-1, -2, 1, 2, 0, 2, 23));
        l9c l9cVar = this.Y1;
        if (l9cVar != null) {
            l9cVar.O(false);
        }
        zb3 zb3Var = new zb3();
        zb3Var.m = false;
        zb3Var.C = false;
        zb3Var.o(k43.h);
        zb3Var.n(350L);
        this.n1.setItemAnimator(zb3Var);
        this.n1.setOnItemClickListener(new ht2(this, (byte) 6));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        LinearLayout m2 = bs2.m(activity, 0);
        m2.setPadding(hl.L(14.0f) + this.u0, hl.L(14.0f), hl.L(14.0f) + this.u0, hl.L(14.0f));
        frameLayout3.addView(m2, tre.e(-1, -2, 87));
        c51 c51Var = new c51(this.J0, activity, true);
        this.T1 = c51Var;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "x  ");
        spannableStringBuilder.setSpan(new wm2(2131232638, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) ob6.M0(2131749235, null));
        c51Var.i(spannableStringBuilder, false, true);
        m2.addView(c51Var, tre.q(-1, 48, 1.0f, 119, 0, 0, 6, 0));
        c51Var.setOnClickListener(new View.OnClickListener(this) {
            public final j13 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                j13 j13Var = this.b;
                switch (b) {
                    case 0:
                        j13Var.dismiss();
                        return;
                    case 1:
                        j13Var.Z0(false);
                        return;
                    default:
                        j13Var.Z0(true);
                        return;
                }
            }
        });
        c51 c51Var2 = new c51(this.J0, activity, true);
        this.U1 = c51Var2;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "x  ");
        spannableStringBuilder2.setSpan(new wm2(2131232640, 0), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) ob6.M0(2131749236, null));
        c51Var2.i(spannableStringBuilder2, false, true);
        m2.addView(c51Var2, tre.q(-1, 48, 1.0f, 119, 6, 0, 0, 0));
        c51Var2.setOnClickListener(new View.OnClickListener(this) {
            public final j13 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                j13 j13Var = this.b;
                switch (b) {
                    case 0:
                        j13Var.dismiss();
                        return;
                    case 1:
                        j13Var.Z0(false);
                        return;
                    default:
                        j13Var.Z0(true);
                        return;
                }
            }
        });
        this.b.addView(frameLayout3, tre.e(-1, -2, 87));
        d79 d79Var = this.n1;
        int i3 = this.u0;
        d79Var.setPadding(i3, 0, i3, hl.L(76.0f));
    }

    @Override
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(d79Var, getContext(), this.a, 0, true, new n82(this, (byte) 14), this.J0);
        this.Y1 = l9cVar;
        return l9cVar;
    }

    @Override
    public final CharSequence K0() {
        return ob6.M0(2131749237, null);
    }

    public final void Z0(boolean z) {
        c51 c51Var;
        if (this.X1) {
            return;
        }
        this.X1 = true;
        if (z) {
            c51Var = this.U1;
        } else {
            c51Var = this.T1;
        }
        c51 c51Var2 = c51Var;
        c51Var2.setLoading(true);
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.W1);
        TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
        createconferencecall.random_id = Utilities.b.nextInt();
        ConnectionsManager.getInstance(this.a).sendRequest(createconferencecall, new si1(this, c51Var2, z, hashSet, (byte) 3));
    }
}
