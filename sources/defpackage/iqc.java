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
public final class iqc extends n5c implements gk7 {
    @Override
    public final void Y(ArrayList arrayList, l5c l5cVar) {
        w25 w25Var = c.C(this.currentAccount).g;
        if (!w25Var.d.isEmpty()) {
            oo1.o(2131742963, null, arrayList);
        }
        ArrayList arrayList2 = w25Var.d;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            int i2 = gqc.b;
            c4c K = c4c.K(gqc.class);
            K.H = (TL_wallet.tonConnectSession) obj;
            arrayList.add(K);
        }
        arrayList.add(c4c.C(k96.M0(2131742912, null)));
    }

    @Override
    public final CharSequence Z() {
        return k96.M0(2131742913, null);
    }

    @Override
    public final void a0(c4c c4cVar, View view) {
        String M0;
        String str;
        TLRPC.WebDocument webDocument;
        Object obj = c4cVar.H;
        if (obj instanceof TL_wallet.tonConnectSession) {
            TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
            Activity parentActivity = getParentActivity();
            wjb resourceProvider = getResourceProvider();
            nu9 nu9Var = new nu9(this, tonconnectsession, (byte) 24);
            LinearLayout m = ir2.m(parentActivity, 1);
            FrameLayout frameLayout = new FrameLayout(parentActivity);
            ImageView imageView = new ImageView(parentActivity);
            imageView.setImageResource(2131231244);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i = bkb.h6;
            ff0 f0 = bkb.f0(bkb.v0(i, resourceProvider), 1, -1);
            vkb M = zkb.M(i);
            imageView.setBackground(f0);
            zkb.j(imageView, f0, null, M, resourceProvider);
            int i2 = bkb.F6;
            zkb.s(imageView, i2, resourceProvider, PorterDuff.Mode.SRC_IN);
            ote.a(imageView);
            frameLayout.addView(imageView, nme.d(48, 48.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f));
            be0 be0Var = new be0(parentActivity);
            be0Var.setRoundRadius(gl.L(38.0f));
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            if (tonconnectmanifest != null && (webDocument = tonconnectmanifest.icon) != null) {
                be0Var.p(gl5.p(usc.c(webDocument)), "76_76", null, tonconnectsession.manifest);
            }
            frameLayout.addView(be0Var, nme.d(76, 76.0f, 49, 0.0f, 32.0f, 0.0f, 0.0f));
            m.addView(frameLayout, nme.o(-1, -2));
            TextView textView = new TextView(parentActivity);
            textView.setTypeface(gl.o());
            textView.setTextSize(1, 20.0f);
            textView.setGravity(17);
            TL_wallet.tonConnectManifest tonconnectmanifest2 = tonconnectsession.manifest;
            if (tonconnectmanifest2 != null) {
                M0 = tonconnectmanifest2.name;
            } else {
                M0 = k96.M0(2131742915, null);
            }
            textView.setText(M0);
            zkb.X(textView, i2, resourceProvider);
            m.addView(textView, nme.t(-2, -2, 49, 36, 16, 36, 0));
            TL_wallet.tonConnectManifest tonconnectmanifest3 = tonconnectsession.manifest;
            if (tonconnectmanifest3 != null) {
                str = tonconnectmanifest3.url;
            } else {
                str = null;
            }
            String J0 = gl.J0(str, false);
            if (!TextUtils.isEmpty(J0)) {
                TextView textView2 = new TextView(parentActivity);
                ug8.v(textView2, 1, 14.0f);
                zkb.X(textView2, bkb.Ei, resourceProvider);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) J0);
                textView2.setText(spannableStringBuilder);
                m.addView(textView2, nme.t(-2, -2, 49, 36, 6, 36, 0));
            }
            TextView textView3 = new TextView(parentActivity);
            textView3.setTextSize(1, 14.0f);
            textView3.setGravity(17);
            textView3.setText(k96.M0(2131742914, null));
            zkb.X(textView3, i2, resourceProvider);
            m.addView(textView3, nme.t(-2, -2, 49, 36, 16, 36, 28));
            u41 u41Var = new u41(resourceProvider, parentActivity, true);
            u41Var.setRoundRadius(24);
            u41Var.setText(k96.M0(2131742887, null));
            int i3 = bkb.p7;
            u41Var.setColor(bkb.v0(i3, resourceProvider));
            if (u41Var.getBackground() != null) {
                Drawable background = u41Var.getBackground();
                vkb M2 = zkb.M(i3);
                u41Var.setBackground(background);
                zkb.j(u41Var, background, M2, null, resourceProvider);
            }
            m.addView(u41Var, nme.t(-1, 44, 1, 16, 0, 16, 16));
            cj7 cj7Var = new cj7(parentActivity, m, resourceProvider);
            cj7Var.show();
            imageView.setOnClickListener(new j25(cj7Var, (byte) 1));
            u41Var.setOnClickListener(new ee(u41Var, nu9Var, cj7Var, resourceProvider, (byte) 20));
        }
    }

    @Override
    public final boolean b0(c4c c4cVar, View view) {
        return false;
    }

    public final void c0(TL_wallet.tonConnectSession tonconnectsession, p8c p8cVar) {
        w25 w25Var = c.C(this.currentAccount).g;
        w25Var.getClass();
        gl.d3(new jf4(w25Var, tonconnectsession, p8cVar, (byte) 12));
    }

    @Override
    public final View createView(Context context) {
        this.fragmentView = super.createView(context);
        this.actionBar.setAdaptiveBackground(this.a);
        this.a.r1();
        this.a.setClipToPadding(false);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        va vaVar;
        if (i == kk7.c4 && (vaVar = this.a) != null) {
            vaVar.g3.O(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, kk7.c4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, kk7.c4);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.a.setPadding(0, 0, 0, i4);
        this.a.setClipToPadding(false);
    }
}
