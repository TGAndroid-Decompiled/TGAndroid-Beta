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
import org.telegram.ui.mb1;
import org.telegram.ui.nj1;
import org.telegram.ui.vy0;
public class WearAuthListenerService extends x8.k {
    public static final String PATH_CANCEL = "/tg-wear-auth/cancel";
    public static final String PATH_OFFER = "/tg-wear-auth/offer";

    public static void lambda$onMessageReceived$0(String str, String str2, byte[] bArr) {
        org.telegram.ui.ActionBar.e6 e6Var;
        str.getClass();
        if (!str.equals("/tg-wear-auth/offer")) {
            if (!str.equals("/tg-wear-auth/cancel")) {
                FileLog.d("wear-auth: unexpected path ".concat(str));
                return;
            }
            FileLog.d("wear-auth: cancel from " + str2);
            BigInteger bigInteger = nj1.f40227a;
            FileLog.d("wear-auth: cancel received; dropping session and dismissing sheet");
            nj1.d = null;
            org.telegram.ui.ActionBar.f3 f3Var = nj1.f40229c;
            if (f3Var != null) {
                f3Var.dismiss();
                nj1.f40229c = null;
                return;
            }
            return;
        }
        StringBuilder w10 = a1.g.w("wear-auth: offer from ", str2, " (");
        w10.append(bArr.length);
        w10.append(" bytes)");
        FileLog.d(w10.toString());
        BigInteger bigInteger2 = nj1.f40227a;
        if (bArr.length != 272) {
            FileLog.d("wear-auth: malformed offer (" + bArr.length + ")");
            return;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        ci.u5 u5Var = nj1.d;
        if (u5Var != null && Arrays.equals((byte[]) u5Var.f6065a, copyOfRange)) {
            FileLog.d("wear-auth: duplicate offer (same sessionId) — ignoring");
            return;
        }
        FileLog.d("wear-auth: new session " + nj1.d(copyOfRange) + " from " + str2);
        ?? obj = new Object();
        obj.f6065a = copyOfRange;
        obj.f6066b = copyOfRange2;
        obj.f6067c = str2;
        nj1.d = obj;
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context != null) {
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U != null) {
                e6Var = U.getResourceProvider();
            } else {
                e6Var = null;
            }
            org.telegram.ui.ActionBar.f3 f3Var2 = nj1.f40229c;
            if (f3Var2 != null) {
                f3Var2.dismiss();
                nj1.f40229c = null;
            }
            org.telegram.ui.ActionBar.f3 i10 = bi.i(1, context, e6Var, false);
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
            Collections.sort(arrayList, new mb1(4));
            if (arrayList.isEmpty()) {
                return;
            }
            FrameLayout frameLayout2 = new FrameLayout(context);
            int i13 = i11;
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20887i5, e6Var)));
            org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
            y9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
            y9Var.getImageReceiver().setCrossfadeWithOldImage(true);
            org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
            int[] iArr = {UserConfig.selectedAccount};
            TLRPC.User currentUser = UserConfig.getInstance(iArr[0]).getCurrentUser();
            j9Var.r(currentUser);
            y9Var.e(currentUser, j9Var);
            frameLayout3.addView(y9Var, w7.x5.e(28, 28, 115));
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21054r5, e6Var), PorterDuff.Mode.SRC_IN));
            imageView.setImageResource(R.drawable.arrows_select);
            frameLayout3.addView(imageView, w7.x5.a(18.0f, 0.0f, 0.0f, 4.0f, 0.0f, 18, 21));
            frameLayout2.addView(frameLayout3, w7.x5.e(52, 28, 17));
            frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
            frameLayout.addView(frameLayout2, w7.x5.p(-2, -2, 0.0f, 51, 6, 4, 6, 0));
            w7.z5.a(frameLayout2);
            if (arrayList.size() <= 1) {
                frameLayout2.setVisibility(8);
            }
            LinearLayout e7 = bi.e(context, 1);
            frameLayout.addView(e7, w7.x5.e(-1, -1, 119));
            org.telegram.ui.Components.y9 y9Var2 = new org.telegram.ui.Components.y9(context);
            e7.addView(y9Var2, w7.x5.r(130, 130, 49, 32.0f, 32.0f, 32.0f, 9.66f));
            MediaDataController.getInstance(i13).setPlaceholderImage(y9Var2, "Utya3D", "😎", "130_130");
            int i14 = org.telegram.ui.ActionBar.i6.f20905j5;
            TextView b10 = w7.b6.b(context, 20.0f, i14, true, e6Var);
            b10.setGravity(17);
            b10.setText(LocaleController.getString(R.string.WearAuthTitle));
            e7.addView(b10, w7.x5.r(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
            TextView b11 = w7.b6.b(context, 14.0f, i14, false, null);
            b11.setGravity(17);
            b11.setText(LocaleController.getString(R.string.WearAuthText));
            e7.addView(b11, w7.x5.t(-1, -2, 49, 32, 0, 32, 24));
            ci.d f7 = bi.f(24, context, e6Var, true);
            f7.setText(LocaleController.getString(R.string.Next));
            e7.addView(f7, w7.x5.t(-1, 48, 7, 12, 12, 12, 8));
            int i15 = org.telegram.ui.ActionBar.i6.f20741a7;
            i10.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(i15, e6Var));
            i10.fixNavigationBar(org.telegram.ui.ActionBar.i6.w0(i15, e6Var));
            frameLayout2.setOnClickListener(new org.telegram.ui.Components.m0(i10, frameLayout3, arrayList, iArr, j9Var, y9Var, 4));
            f7.setOnClickListener(new vy0(17, f7, iArr));
            nj1.f40229c = i10;
            i10.show();
        }
    }

    @Override
    public void onMessageReceived(x8.g gVar) {
        y8.k0 k0Var = (y8.k0) gVar;
        String str = k0Var.f51791b;
        String str2 = k0Var.d;
        byte[] bArr = k0Var.f51792c;
        if ("/tg-wear-auth/offer".equals(str)) {
            try {
                Intent intent = new Intent(this, LaunchActivity.class);
                intent.addFlags(268566528);
                startActivity(intent);
            } catch (Exception e7) {
                FileLog.e("wear-auth: failed to pop LaunchActivity", e7);
            }
        }
        AndroidUtilities.runOnUIThread(new ul(str, str2, bArr, 1));
    }
}
