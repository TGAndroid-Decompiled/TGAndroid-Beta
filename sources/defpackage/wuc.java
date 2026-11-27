package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;
public final class wuc extends n9c implements fn7 {
    @Override
    public final void Y(ArrayList arrayList, l9c l9cVar) {
        a55 a55Var = c.C(this.currentAccount).g;
        if (!a55Var.d.isEmpty()) {
            bp1.o(2131742857, null, arrayList);
        }
        ArrayList arrayList2 = a55Var.d;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            int i2 = uuc.b;
            b8c K = b8c.K(uuc.class);
            K.H = (TL_wallet.tonConnectSession) obj;
            arrayList.add(K);
        }
        arrayList.add(b8c.C(ob6.M0(2131742806, null)));
    }

    @Override
    public final CharSequence Z() {
        return ob6.M0(2131742807, null);
    }

    @Override
    public final void a0(b8c b8cVar, View view) {
        String M0;
        String str;
        TLRPC.WebDocument webDocument;
        Object obj = b8cVar.H;
        if (obj instanceof TL_wallet.tonConnectSession) {
            TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
            Activity parentActivity = getParentActivity();
            vnb resourceProvider = getResourceProvider();
            ku9 ku9Var = new ku9(this, tonconnectsession, (byte) 24);
            LinearLayout m = bs2.m(parentActivity, 1);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            ImageView imageView = new ImageView(parentActivity);
            imageView.setImageResource(2131231244);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i = aob.i6;
            hf0 f0 = aob.f0(aob.v0(i, resourceProvider), 1, -1);
            uob M = yob.M(i);
            imageView.setBackground(f0);
            yob.j(imageView, f0, null, M, resourceProvider);
            int i2 = aob.G6;
            yob.s(imageView, i2, resourceProvider, PorterDuff.Mode.SRC_IN);
            iye.a(imageView);
            frameLayout.addView(imageView, tre.d(48, 48.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f));
            de0 de0Var = new de0(parentActivity);
            de0Var.setRoundRadius(hl.L(38.0f));
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            if (tonconnectmanifest != null && (webDocument = tonconnectmanifest.icon) != null) {
                de0Var.p(jn5.p(jxc.c(webDocument)), "76_76", null, tonconnectsession.manifest);
            }
            frameLayout.addView(de0Var, tre.d(76, 76.0f, 49, 0.0f, 32.0f, 0.0f, 0.0f));
            m.addView(frameLayout, tre.o(-1, -2));
            TextView textView = new TextView(parentActivity);
            textView.setTypeface(hl.o());
            textView.setTextSize(1, 20.0f);
            textView.setGravity(17);
            TL_wallet.tonConnectManifest tonconnectmanifest2 = tonconnectsession.manifest;
            if (tonconnectmanifest2 != null) {
                M0 = tonconnectmanifest2.name;
            } else {
                M0 = ob6.M0(2131742809, null);
            }
            textView.setText(M0);
            yob.X(textView, i2, resourceProvider);
            m.addView(textView, tre.t(-2, -2, 49, 36, 16, 36, 0));
            TL_wallet.tonConnectManifest tonconnectmanifest3 = tonconnectsession.manifest;
            if (tonconnectmanifest3 != null) {
                str = tonconnectmanifest3.url;
            } else {
                str = null;
            }
            String J0 = hl.J0(str, false);
            if (!TextUtils.isEmpty(J0)) {
                TextView textView2 = new TextView(parentActivity);
                ik8.v(textView2, 1, 14.0f);
                yob.X(textView2, aob.Fi, resourceProvider);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) J0);
                textView2.setText(spannableStringBuilder);
                m.addView(textView2, tre.t(-2, -2, 49, 36, 6, 36, 0));
            }
            TextView textView3 = new TextView(parentActivity);
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(ob6.M0(2131742808, null));
            yob.X(textView3, i2, resourceProvider);
            m.addView(textView3, tre.t(-2, -2, 49, 36, 16, 36, 28));
            c51 c51Var = new c51(resourceProvider, parentActivity, true);
            c51Var.setRoundRadius(24);
            c51Var.setText(ob6.M0(2131742781, null));
            int i3 = aob.q7;
            c51Var.setColor(aob.v0(i3, resourceProvider));
            if (c51Var.getBackground() != null) {
                Drawable background = c51Var.getBackground();
                uob M2 = yob.M(i3);
                c51Var.setBackground(background);
                yob.j(c51Var, background, M2, null, resourceProvider);
            }
            m.addView(c51Var, tre.t(-1, 44, 1, 16, 0, 16, 16));
            jl7 jl7Var = new jl7(parentActivity, m, resourceProvider);
            jl7Var.show();
            imageView.setOnClickListener(new e45(jl7Var, (byte) 1));
            c51Var.setOnClickListener(new cg(c51Var, ku9Var, jl7Var, resourceProvider, (byte) 21));
        }
    }

    @Override
    public final boolean b0(b8c b8cVar, View view) {
        return false;
    }

    public final void c0(TL_wallet.tonConnectSession tonconnectsession, pcc pccVar) {
        a55 a55Var = c.C(this.currentAccount).g;
        a55Var.getClass();
        hl.c3(new re4((Object) a55Var, (Object) tonconnectsession, (Object) pccVar, (byte) 15));
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.s1();
        this.a.setClipToPadding(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        wa waVar;
        if (i == jn7.d4 && (waVar = this.a) != null) {
            waVar.g3.O(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, jn7.d4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, jn7.d4);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.a.setPadding(0, 0, 0, i4);
        this.a.setClipToPadding(false);
    }
}
