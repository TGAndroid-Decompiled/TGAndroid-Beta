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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fi1;
import org.telegram.ui.o70;
import org.telegram.ui.zd0;
public class WearAuthListenerService extends x8.k {
    public static final String PATH_CANCEL = "/tg-wear-auth/cancel";
    public static final String PATH_OFFER = "/tg-wear-auth/offer";

    public static void lambda$onMessageReceived$0(String str, String str2, byte[] bArr) {
        org.telegram.ui.ActionBar.g6 g6Var;
        str.getClass();
        if (!str.equals("/tg-wear-auth/offer")) {
            if (!str.equals("/tg-wear-auth/cancel")) {
                FileLog.d("wear-auth: unexpected path ".concat(str));
                return;
            }
            FileLog.d("wear-auth: cancel from " + str2);
            BigInteger bigInteger = fi1.f37343a;
            FileLog.d("wear-auth: cancel received; dropping session and dismissing sheet");
            fi1.d = null;
            org.telegram.ui.ActionBar.h3 h3Var = fi1.f37345c;
            if (h3Var != null) {
                h3Var.dismiss();
                fi1.f37345c = null;
                return;
            }
            return;
        }
        StringBuilder v = a1.g.v("wear-auth: offer from ", str2, " (");
        v.append(bArr.length);
        v.append(" bytes)");
        FileLog.d(v.toString());
        BigInteger bigInteger2 = fi1.f37343a;
        if (bArr.length != 272) {
            FileLog.d("wear-auth: malformed offer (" + bArr.length + ")");
            return;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        com.google.android.gms.internal.cast.z5 z5Var = fi1.d;
        if (z5Var != null && Arrays.equals((byte[]) z5Var.f6893b, copyOfRange)) {
            FileLog.d("wear-auth: duplicate offer (same sessionId) — ignoring");
            return;
        }
        FileLog.d("wear-auth: new session " + fi1.d(copyOfRange) + " from " + str2);
        ?? obj = new Object();
        obj.f6893b = copyOfRange;
        obj.f6894c = copyOfRange2;
        obj.f6892a = str2;
        fi1.d = obj;
        Context context = LaunchActivity.I1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context != null) {
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U != null) {
                g6Var = U.getResourceProvider();
            } else {
                g6Var = null;
            }
            org.telegram.ui.ActionBar.h3 h3Var2 = fi1.f37345c;
            if (h3Var2 != null) {
                h3Var2.dismiss();
                fi1.f37345c = null;
            }
            org.telegram.ui.ActionBar.h3 j10 = tl.j(1, context, g6Var, false);
            FrameLayout frameLayout = new FrameLayout(context);
            j10.customView = frameLayout;
            int i10 = UserConfig.selectedAccount;
            ArrayList arrayList = new ArrayList();
            arrayList.clear();
            for (int i11 = 0; i11 < 4; i11++) {
                if (UserConfig.getInstance(i11).isClientActivated()) {
                    if (!ConnectionsManager.getInstance(i11).isTestBackend()) {
                        i10 = i11;
                    }
                    arrayList.add(Integer.valueOf(i11));
                }
            }
            Collections.sort(arrayList, new o70(12));
            if (arrayList.isEmpty()) {
                return;
            }
            FrameLayout frameLayout2 = new FrameLayout(context);
            int i12 = i10;
            FrameLayout frameLayout3 = new FrameLayout(context);
            int dp = AndroidUtilities.dp(14.0f);
            int i13 = org.telegram.ui.ActionBar.k6.f21272i5;
            Drawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, org.telegram.ui.ActionBar.k6.w0(i13, g6Var));
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i13);
            frameLayout3.setBackground(c02);
            org.telegram.ui.ActionBar.r6.k(frameLayout3, c02, O, null, g6Var);
            org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
            u9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
            u9Var.getImageReceiver().setCrossfadeWithOldImage(true);
            org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.g6) null);
            int[] iArr = {UserConfig.selectedAccount};
            TLRPC.User currentUser = UserConfig.getInstance(iArr[0]).getCurrentUser();
            f9Var.r(currentUser);
            u9Var.e(currentUser, f9Var);
            frameLayout3.addView(u9Var, w7.z5.e(28, 28, 115));
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f21440r5, g6Var, PorterDuff.Mode.SRC_IN);
            imageView.setImageResource(R.drawable.arrows_select);
            frameLayout3.addView(imageView, w7.z5.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
            frameLayout2.addView(frameLayout3, w7.z5.e(52, 28, 17));
            frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
            frameLayout.addView(frameLayout2, w7.z5.p(-2, -2, 0.0f, 51, 6, 4, 6, 0));
            w7.b6.a(frameLayout2);
            if (arrayList.size() <= 1) {
                frameLayout2.setVisibility(8);
            }
            LinearLayout e = tl.e(context, 1);
            frameLayout.addView(e, w7.z5.e(-1, -1, 119));
            org.telegram.ui.Components.u9 u9Var2 = new org.telegram.ui.Components.u9(context);
            e.addView(u9Var2, w7.z5.r(130, 130, 49, 32.0f, 32.0f, 32.0f, 9.66f));
            MediaDataController.getInstance(i12).setPlaceholderImage(u9Var2, "Utya3D", "😎", "130_130");
            int i14 = org.telegram.ui.ActionBar.k6.f21290j5;
            TextView b10 = w7.d6.b(context, 20.0f, i14, true, g6Var);
            b10.setGravity(17);
            b10.setText(LocaleController.getString(R.string.WearAuthTitle));
            e.addView(b10, w7.z5.r(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
            TextView b11 = w7.d6.b(context, 14.0f, i14, false, null);
            b11.setGravity(17);
            b11.setText(LocaleController.getString(R.string.WearAuthText));
            e.addView(b11, w7.z5.t(-1, -2, 49, 32, 0, 32, 24));
            ei.d g10 = tl.g(24, context, g6Var, true);
            g10.setText(LocaleController.getString(R.string.Next));
            e.addView(g10, w7.z5.t(-1, 48, 7, 12, 12, 12, 8));
            int i15 = org.telegram.ui.ActionBar.k6.f21126a7;
            j10.setBackgroundColorKey(i15);
            j10.fixNavigationBarKey(i15);
            frameLayout2.setOnClickListener(new org.telegram.ui.Components.m0(j10, frameLayout3, arrayList, iArr, f9Var, u9Var, 4));
            g10.setOnClickListener(new zd0(29, g10, iArr));
            fi1.f37345c = j10;
            j10.show();
        }
    }

    @Override
    public void onMessageReceived(x8.g gVar) {
        y8.k0 k0Var = (y8.k0) gVar;
        String str = k0Var.f50461b;
        String str2 = k0Var.d;
        byte[] bArr = k0Var.f50462c;
        if ("/tg-wear-auth/offer".equals(str)) {
            try {
                Intent intent = new Intent(this, LaunchActivity.class);
                intent.addFlags(268566528);
                startActivity(intent);
            } catch (Exception e) {
                FileLog.e("wear-auth: failed to pop LaunchActivity", e);
            }
        }
        AndroidUtilities.runOnUIThread(new ul(str, str2, bArr, 1));
    }
}
