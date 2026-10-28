package org.telegram.messenger;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dv;
import org.telegram.ui.ki1;
import org.telegram.ui.zd0;
public class WearAuthListenerService extends y8.k {
    public static final String PATH_CANCEL = "/tg-wear-auth/cancel";
    public static final String PATH_OFFER = "/tg-wear-auth/offer";

    public static void lambda$onMessageReceived$0(String str, String str2, byte[] bArr) {
        org.telegram.ui.ActionBar.u6 u6Var;
        str.getClass();
        if (!str.equals("/tg-wear-auth/offer")) {
            if (!str.equals("/tg-wear-auth/cancel")) {
                FileLog.d("wear-auth: unexpected path ".concat(str));
                return;
            }
            FileLog.d("wear-auth: cancel from " + str2);
            BigInteger bigInteger = ki1.f40806a;
            FileLog.d("wear-auth: cancel received; dropping session and dismissing sheet");
            ki1.d = null;
            org.telegram.ui.ActionBar.k3 k3Var = ki1.f40808c;
            if (k3Var != null) {
                k3Var.dismiss();
                ki1.f40808c = null;
                return;
            }
            return;
        }
        StringBuilder v = a1.g.v("wear-auth: offer from ", str2, " (");
        v.append(bArr.length);
        v.append(" bytes)");
        FileLog.d(v.toString());
        BigInteger bigInteger2 = ki1.f40806a;
        if (bArr.length != 272) {
            FileLog.d("wear-auth: malformed offer (" + bArr.length + ")");
            return;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        a8.me meVar = ki1.d;
        if (meVar != null && Arrays.equals((byte[]) meVar.f614a, copyOfRange)) {
            FileLog.d("wear-auth: duplicate offer (same sessionId) — ignoring");
            return;
        }
        FileLog.d("wear-auth: new session " + ki1.d(copyOfRange) + " from " + str2);
        ?? obj = new Object();
        obj.f614a = copyOfRange;
        obj.f615b = copyOfRange2;
        obj.f616c = str2;
        ki1.d = obj;
        Context context = LaunchActivity.I1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context != null) {
            org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
            if (U != null) {
                u6Var = U.getResourceProvider();
            } else {
                u6Var = null;
            }
            org.telegram.ui.ActionBar.k3 k3Var2 = ki1.f40808c;
            if (k3Var2 != null) {
                k3Var2.dismiss();
                ki1.f40808c = null;
            }
            org.telegram.ui.ActionBar.k3 i10 = wh.i(1, context, u6Var, false);
            FrameLayout frameLayout = new FrameLayout(context);
            i10.customView = frameLayout;
            int i11 = UserConfig.selectedAccount;
            ArrayList arrayList = new ArrayList();
            arrayList.clear();
            for (int i12 = 0; i12 < 4; i12++) {
                if (UserConfig.getInstance(i12).isClientActivated()) {
                    if (!ConnectionsManager.getInstance(i12).isTestBackend()) {
                        i11 = i12;
                    }
                    arrayList.add(Integer.valueOf(i12));
                }
            }
            Collections.sort(arrayList, new dv(15));
            if (arrayList.isEmpty()) {
                return;
            }
            FrameLayout frameLayout2 = new FrameLayout(context);
            int i13 = i11;
            FrameLayout frameLayout3 = new FrameLayout(context);
            int dp = AndroidUtilities.dp(14.0f);
            int i14 = org.telegram.ui.ActionBar.y6.f23448i5;
            Drawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.w0(i14, u6Var));
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i14);
            frameLayout3.setBackground(c02);
            org.telegram.ui.ActionBar.f7.k(frameLayout3, c02, N, null, u6Var);
            org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
            y9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
            y9Var.getImageReceiver().setCrossfadeWithOldImage(true);
            org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
            int[] iArr = {UserConfig.selectedAccount};
            TLRPC.User currentUser = UserConfig.getInstance(iArr[0]).getCurrentUser();
            j9Var.r(currentUser);
            y9Var.f(currentUser, j9Var);
            frameLayout3.addView(y9Var, kb1.i(28, 28, 115));
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.f23615r5, u6Var, PorterDuff.Mode.SRC_IN);
            imageView.setImageResource(R.drawable.arrows_select);
            frameLayout3.addView(imageView, kb1.h(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
            frameLayout2.addView(frameLayout3, kb1.i(52, 28, 17));
            frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
            frameLayout.addView(frameLayout2, kb1.t(-2, -2, 0.0f, 51, 6, 4, 6, 0));
            kb1.b(frameLayout2);
            if (arrayList.size() <= 1) {
                frameLayout2.setVisibility(8);
            }
            LinearLayout d = wh.d(context, 1);
            frameLayout.addView(d, kb1.i(-1, -1, 119));
            org.telegram.ui.Components.y9 y9Var2 = new org.telegram.ui.Components.y9(context);
            d.addView(y9Var2, kb1.v(130, 130, 49, 32.0f, 32.0f, 32.0f, 9.66f));
            MediaDataController.getInstance(i13).setPlaceholderImage(y9Var2, "Utya3D", "😎", "130_130");
            int i15 = org.telegram.ui.ActionBar.y6.f23465j5;
            TextView L = kb1.L(context, 20.0f, i15, true, u6Var);
            L.setGravity(17);
            L.setText(LocaleController.getString(R.string.WearAuthTitle));
            d.addView(L, kb1.v(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
            TextView L2 = kb1.L(context, 14.0f, i15, false, null);
            L2.setGravity(17);
            L2.setText(LocaleController.getString(R.string.WearAuthText));
            d.addView(L2, kb1.x(-1, -2, 49, 32, 0, 32, 24));
            fi.d f7 = wh.f(24, context, u6Var, true);
            f7.setText(LocaleController.getString(R.string.Next));
            d.addView(f7, kb1.x(-1, 48, 7, 12, 12, 12, 8));
            int i16 = org.telegram.ui.ActionBar.y6.f23300a7;
            i10.setBackgroundColorKey(i16);
            i10.fixNavigationBarKey(i16);
            frameLayout2.setOnClickListener(new org.telegram.ui.Components.m0(i10, frameLayout3, arrayList, iArr, j9Var, y9Var, 4));
            f7.setOnClickListener(new zd0(29, f7, iArr));
            ki1.f40808c = i10;
            i10.show();
        }
    }

    @Override
    public void onMessageReceived(y8.g gVar) {
        z8.l0 l0Var = (z8.l0) gVar;
        String str = l0Var.f52805b;
        String str2 = l0Var.d;
        byte[] bArr = l0Var.f52806c;
        if ("/tg-wear-auth/offer".equals(str)) {
            try {
                Intent intent = new Intent(this, LaunchActivity.class);
                intent.addFlags(268566528);
                startActivity(intent);
            } catch (Exception e) {
                FileLog.e("wear-auth: failed to pop LaunchActivity", e);
            }
        }
        AndroidUtilities.runOnUIThread(new el(str, str2, bArr, 2));
    }
}
