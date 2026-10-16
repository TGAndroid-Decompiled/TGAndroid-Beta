package org.telegram.messenger;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.ui.bz0;
import org.telegram.ui.ds0;
import org.telegram.ui.tj1;
public class WearAuthListenerService extends x8.k {
    public static final String PATH_CANCEL = "/tg-wear-auth/cancel";
    public static final String PATH_OFFER = "/tg-wear-auth/offer";

    public static void lambda$onMessageReceived$0(String str, String str2, byte[] bArr) {
        org.telegram.ui.ActionBar.c6 c6Var;
        str.getClass();
        if (!str.equals("/tg-wear-auth/offer")) {
            if (!str.equals("/tg-wear-auth/cancel")) {
                FileLog.d("wear-auth: unexpected path ".concat(str));
                return;
            }
            FileLog.d("wear-auth: cancel from " + str2);
            BigInteger bigInteger = tj1.f40132a;
            FileLog.d("wear-auth: cancel received; dropping session and dismissing sheet");
            tj1.d = null;
            org.telegram.ui.ActionBar.e3 e3Var = tj1.f40134c;
            if (e3Var != null) {
                e3Var.dismiss();
                tj1.f40134c = null;
                return;
            }
            return;
        }
        StringBuilder v = a1.g.v("wear-auth: offer from ", str2, " (");
        v.append(bArr.length);
        v.append(" bytes)");
        FileLog.d(v.toString());
        BigInteger bigInteger2 = tj1.f40132a;
        if (bArr.length != 272) {
            FileLog.d("wear-auth: malformed offer (" + bArr.length + ")");
            return;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        com.google.android.gms.internal.cast.z5 z5Var = tj1.d;
        if (z5Var != null && Arrays.equals((byte[]) z5Var.f5429b, copyOfRange)) {
            FileLog.d("wear-auth: duplicate offer (same sessionId) — ignoring");
            return;
        }
        FileLog.d("wear-auth: new session " + tj1.d(copyOfRange) + " from " + str2);
        ?? obj = new Object();
        obj.f5429b = copyOfRange;
        obj.f5430c = copyOfRange2;
        obj.f5428a = str2;
        tj1.d = obj;
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context != null) {
            org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
            if (U != null) {
                c6Var = U.getResourceProvider();
            } else {
                c6Var = null;
            }
            org.telegram.ui.ActionBar.e3 e3Var2 = tj1.f40134c;
            if (e3Var2 != null) {
                e3Var2.dismiss();
                tj1.f40134c = null;
            }
            org.telegram.ui.ActionBar.e3 i10 = sk.i(1, context, c6Var, false);
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
            Collections.sort(arrayList, new ds0(8));
            if (arrayList.isEmpty()) {
                return;
            }
            FrameLayout frameLayout2 = new FrameLayout(context);
            int i13 = i11;
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19689i5, c6Var)));
            org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
            z9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
            z9Var.getImageReceiver().setCrossfadeWithOldImage(true);
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
            int[] iArr = {UserConfig.selectedAccount};
            TLRPC.User currentUser = UserConfig.getInstance(iArr[0]).getCurrentUser();
            k9Var.r(currentUser);
            z9Var.e(currentUser, k9Var);
            frameLayout3.addView(z9Var, w7.z5.e(28, 28, 115));
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19857r5, c6Var), PorterDuff.Mode.SRC_IN));
            imageView.setImageResource(R.drawable.arrows_select);
            frameLayout3.addView(imageView, w7.z5.a(18.0f, 0.0f, 0.0f, 4.0f, 0.0f, 18, 21));
            frameLayout2.addView(frameLayout3, w7.z5.e(52, 28, 17));
            frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
            frameLayout.addView(frameLayout2, w7.z5.p(-2, -2, 0.0f, 51, 6, 4, 6, 0));
            w7.b6.a(frameLayout2);
            if (arrayList.size() <= 1) {
                frameLayout2.setVisibility(8);
            }
            LinearLayout e = sk.e(context, 1);
            frameLayout.addView(e, w7.z5.e(-1, -1, 119));
            org.telegram.ui.Components.z9 z9Var2 = new org.telegram.ui.Components.z9(context);
            e.addView(z9Var2, w7.z5.r(130, 130, 49, 32.0f, 32.0f, 32.0f, 9.66f));
            MediaDataController.getInstance(i13).setPlaceholderImage(z9Var2, "Utya3D", "😎", "130_130");
            int i14 = org.telegram.ui.ActionBar.g6.f19707j5;
            TextView b10 = w7.d6.b(context, 20.0f, i14, true, c6Var);
            b10.setGravity(17);
            b10.setText(LocaleController.getString(R.string.WearAuthTitle));
            e.addView(b10, w7.z5.r(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
            TextView b11 = w7.d6.b(context, 14.0f, i14, false, null);
            b11.setGravity(17);
            b11.setText(LocaleController.getString(R.string.WearAuthText));
            e.addView(b11, w7.z5.t(-1, -2, 49, 32, 0, 32, 24));
            di.d f7 = sk.f(24, context, c6Var, true);
            f7.setText(LocaleController.getString(R.string.Next));
            e.addView(f7, w7.z5.t(-1, 48, 7, 12, 12, 12, 8));
            int i15 = org.telegram.ui.ActionBar.g6.f19543a7;
            i10.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(i15, c6Var));
            i10.fixNavigationBar(org.telegram.ui.ActionBar.g6.w0(i15, c6Var));
            frameLayout2.setOnClickListener(new org.telegram.ui.Components.m0(i10, frameLayout3, arrayList, iArr, k9Var, z9Var, 4));
            f7.setOnClickListener(new bz0(17, f7, iArr));
            tj1.f40134c = i10;
            i10.show();
        }
    }

    @Override
    public void onMessageReceived(x8.g gVar) {
        y8.k0 k0Var = (y8.k0) gVar;
        String str = k0Var.f48629b;
        String str2 = k0Var.d;
        byte[] bArr = k0Var.f48630c;
        if ("/tg-wear-auth/offer".equals(str)) {
            try {
                Intent intent = new Intent(this, LaunchActivity.class);
                intent.addFlags(268566528);
                startActivity(intent);
            } catch (Exception e) {
                FileLog.e("wear-auth: failed to pop LaunchActivity", e);
            }
        }
        AndroidUtilities.runOnUIThread(new zl(str, str2, bArr));
    }
}
