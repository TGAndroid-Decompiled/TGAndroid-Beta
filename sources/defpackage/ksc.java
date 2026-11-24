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
public final class ksc extends n7c implements jm7 {
    @Override
    public final void Z(ArrayList arrayList, l7c l7cVar) {
        w45 w45Var = c.C(this.currentAccount).g;
        if (!w45Var.d.isEmpty()) {
            aq1.o(2131742889, null, arrayList);
        }
        ArrayList arrayList2 = w45Var.d;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            int i2 = isc.b;
            c6c K = c6c.K(isc.class);
            K.H = (TL_wallet.tonConnectSession) obj;
            arrayList.add(K);
        }
        arrayList.add(c6c.C(jb6.M0(2131742838, null)));
    }

    @Override
    public final CharSequence a0() {
        return jb6.M0(2131742839, null);
    }

    @Override
    public final void b0(c6c c6cVar, View view) {
        String M0;
        String str;
        TLRPC.WebDocument webDocument;
        Object obj = c6cVar.H;
        if (obj instanceof TL_wallet.tonConnectSession) {
            TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
            Activity parentActivity = getParentActivity();
            ylb resourceProvider = getResourceProvider();
            ts9 ts9Var = new ts9(this, tonconnectsession, (byte) 25);
            LinearLayout l = td4.l(parentActivity, 1);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            ImageView imageView = new ImageView(parentActivity);
            imageView.setImageResource(2131231245);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i = cmb.h6;
            fg0 f0 = cmb.f0(cmb.v0(i, resourceProvider), 1, -1);
            wmb M = anb.M(i);
            imageView.setBackground(f0);
            anb.j(imageView, f0, null, M, resourceProvider);
            int i2 = cmb.F6;
            anb.s(imageView, i2, resourceProvider, PorterDuff.Mode.SRC_IN);
            rve.a(imageView);
            frameLayout.addView(imageView, qoe.d(48, 48.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f));
            bf0 bf0Var = new bf0(parentActivity);
            bf0Var.setRoundRadius(gm.L(38.0f));
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            if (tonconnectmanifest != null && (webDocument = tonconnectmanifest.icon) != null) {
                bf0Var.p(gn5.p(vuc.c(webDocument)), "76_76", null, tonconnectsession.manifest);
            }
            frameLayout.addView(bf0Var, qoe.d(76, 76.0f, 49, 0.0f, 32.0f, 0.0f, 0.0f));
            l.addView(frameLayout, qoe.o(-1, -2));
            TextView textView = new TextView(parentActivity);
            textView.setTypeface(gm.o());
            textView.setTextSize(1, 20.0f);
            textView.setGravity(17);
            TL_wallet.tonConnectManifest tonconnectmanifest2 = tonconnectsession.manifest;
            if (tonconnectmanifest2 != null) {
                M0 = tonconnectmanifest2.name;
            } else {
                M0 = jb6.M0(2131742841, null);
            }
            textView.setText(M0);
            anb.X(textView, i2, resourceProvider);
            l.addView(textView, qoe.t(-2, -2, 49, 36, 16, 36, 0));
            TL_wallet.tonConnectManifest tonconnectmanifest3 = tonconnectsession.manifest;
            if (tonconnectmanifest3 != null) {
                str = tonconnectmanifest3.url;
            } else {
                str = null;
            }
            String J0 = gm.J0(str, false);
            if (!TextUtils.isEmpty(J0)) {
                TextView textView2 = new TextView(parentActivity);
                wi8.v(textView2, 1, 14.0f);
                anb.X(textView2, cmb.Ei, resourceProvider);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) J0);
                textView2.setText(spannableStringBuilder);
                l.addView(textView2, qoe.t(-2, -2, 49, 36, 6, 36, 0));
            }
            TextView textView3 = new TextView(parentActivity);
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(jb6.M0(2131742840, null));
            anb.X(textView3, i2, resourceProvider);
            l.addView(textView3, qoe.t(-2, -2, 49, 36, 16, 36, 28));
            b61 b61Var = new b61(resourceProvider, parentActivity, true);
            b61Var.setRoundRadius(24);
            b61Var.setText(jb6.M0(2131742813, null));
            int i3 = cmb.p7;
            b61Var.setColor(cmb.v0(i3, resourceProvider));
            if (b61Var.getBackground() != null) {
                Drawable background = b61Var.getBackground();
                wmb M2 = anb.M(i3);
                b61Var.setBackground(background);
                anb.j(b61Var, background, M2, null, resourceProvider);
            }
            l.addView(b61Var, qoe.t(-1, 44, 1, 16, 0, 16, 16));
            el7 el7Var = new el7(parentActivity, l, resourceProvider);
            el7Var.show();
            imageView.setOnClickListener(new j45(el7Var, (byte) 1));
            b61Var.setOnClickListener(new ef(b61Var, ts9Var, el7Var, resourceProvider, (byte) 21));
        }
    }

    @Override
    public final boolean c0(c6c c6cVar, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.r1();
        this.a.setClipToPadding(false);
        return this.fragmentView;
    }

    public final void d0(TL_wallet.tonConnectSession tonconnectsession, qac qacVar) {
        w45 w45Var = c.C(this.currentAccount).g;
        w45Var.getClass();
        gm.c3(new if4(w45Var, tonconnectsession, qacVar, (byte) 14));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        va vaVar;
        if (i == nm7.e4 && (vaVar = this.a) != null) {
            vaVar.g3.O(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, nm7.e4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, nm7.e4);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.a.setPadding(0, 0, 0, i4);
        this.a.setClipToPadding(false);
    }
}
