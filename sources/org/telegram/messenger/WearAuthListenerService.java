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
import org.telegram.ui.kj1;
import org.telegram.ui.mb1;
import org.telegram.ui.vy0;
public class WearAuthListenerService extends x8.k {
    public static final String PATH_CANCEL = "/tg-wear-auth/cancel";
    public static final String PATH_OFFER = "/tg-wear-auth/offer";

    public static void lambda$onMessageReceived$0(String str, String str2, byte[] bArr) {
        org.telegram.ui.ActionBar.f6 f6Var;
        str.getClass();
        if (!str.equals("/tg-wear-auth/offer")) {
            if (!str.equals("/tg-wear-auth/cancel")) {
                FileLog.d("wear-auth: unexpected path ".concat(str));
                return;
            }
            FileLog.d("wear-auth: cancel from " + str2);
            BigInteger bigInteger = kj1.f35220a;
            FileLog.d("wear-auth: cancel received; dropping session and dismissing sheet");
            kj1.d = null;
            org.telegram.ui.ActionBar.f3 f3Var = kj1.f35222c;
            if (f3Var != null) {
                f3Var.dismiss();
                kj1.f35222c = null;
                return;
            }
            return;
        }
        StringBuilder v = a4.a.v("wear-auth: offer from ", str2, " (");
        v.append(bArr.length);
        v.append(" bytes)");
        FileLog.d(v.toString());
        BigInteger bigInteger2 = kj1.f35220a;
        if (bArr.length != 272) {
            FileLog.d("wear-auth: malformed offer (" + bArr.length + ")");
            return;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        cf.c cVar = kj1.d;
        if (cVar != null && Arrays.equals((byte[]) cVar.f4260b, copyOfRange)) {
            FileLog.d("wear-auth: duplicate offer (same sessionId) — ignoring");
            return;
        }
        FileLog.d("wear-auth: new session " + kj1.d(copyOfRange) + " from " + str2);
        ?? obj = new Object();
        obj.f4260b = copyOfRange;
        obj.f4261c = copyOfRange2;
        obj.d = str2;
        kj1.d = obj;
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context != null) {
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U != null) {
                f6Var = U.getResourceProvider();
            } else {
                f6Var = null;
            }
            org.telegram.ui.ActionBar.f3 f3Var2 = kj1.f35222c;
            if (f3Var2 != null) {
                f3Var2.dismiss();
                kj1.f35222c = null;
            }
            org.telegram.ui.ActionBar.f3 j3 = rk.j(1, context, f6Var, false);
            FrameLayout frameLayout = new FrameLayout(context);
            j3.customView = frameLayout;
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
            Collections.sort(arrayList, new mb1(2));
            if (arrayList.isEmpty()) {
                return;
            }
            FrameLayout frameLayout2 = new FrameLayout(context);
            int i12 = i10;
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19198i5, f6Var)));
            org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(context);
            v9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
            v9Var.getImageReceiver().setCrossfadeWithOldImage(true);
            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
            int[] iArr = {UserConfig.selectedAccount};
            TLRPC.User currentUser = UserConfig.getInstance(iArr[0]).getCurrentUser();
            g9Var.r(currentUser);
            v9Var.e(currentUser, g9Var);
            frameLayout3.addView(v9Var, w7.y5.e(28, 28, 115));
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19365r5, f6Var), PorterDuff.Mode.SRC_IN));
            imageView.setImageResource(R.drawable.arrows_select);
            frameLayout3.addView(imageView, w7.y5.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
            frameLayout2.addView(frameLayout3, w7.y5.e(52, 28, 17));
            frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
            frameLayout.addView(frameLayout2, w7.y5.p(-2, -2, 0.0f, 51, 6, 4, 6, 0));
            w7.a6.a(frameLayout2);
            if (arrayList.size() <= 1) {
                frameLayout2.setVisibility(8);
            }
            LinearLayout f7 = rk.f(context, 1);
            frameLayout.addView(f7, w7.y5.e(-1, -1, 119));
            org.telegram.ui.Components.v9 v9Var2 = new org.telegram.ui.Components.v9(context);
            f7.addView(v9Var2, w7.y5.r(130, 130, 49, 32.0f, 32.0f, 32.0f, 9.66f));
            MediaDataController.getInstance(i12).setPlaceholderImage(v9Var2, "Utya3D", "😎", "130_130");
            int i13 = org.telegram.ui.ActionBar.j6.f19216j5;
            TextView b10 = w7.c6.b(context, 20.0f, i13, true, f6Var);
            b10.setGravity(17);
            b10.setText(LocaleController.getString(R.string.WearAuthTitle));
            f7.addView(b10, w7.y5.r(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
            TextView b11 = w7.c6.b(context, 14.0f, i13, false, null);
            b11.setGravity(17);
            b11.setText(LocaleController.getString(R.string.WearAuthText));
            f7.addView(b11, w7.y5.t(-1, -2, 49, 32, 0, 32, 24));
            ci.d g10 = rk.g(24, context, f6Var, true);
            g10.setText(LocaleController.getString(R.string.Next));
            f7.addView(g10, w7.y5.t(-1, 48, 7, 12, 12, 12, 8));
            int i14 = org.telegram.ui.ActionBar.j6.f19053a7;
            j3.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
            j3.fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
            frameLayout2.setOnClickListener(new org.telegram.ui.Components.m0(j3, frameLayout3, arrayList, iArr, g9Var, v9Var, 4));
            g10.setOnClickListener(new vy0(11, g10, iArr));
            kj1.f35222c = j3;
            j3.show();
        }
    }

    @Override
    public void onMessageReceived(x8.g gVar) {
        y8.k0 k0Var = (y8.k0) gVar;
        String str = k0Var.f46705b;
        String str2 = k0Var.d;
        byte[] bArr = k0Var.f46706c;
        if ("/tg-wear-auth/offer".equals(str)) {
            try {
                Intent intent = new Intent(this, LaunchActivity.class);
                intent.addFlags(268566528);
                startActivity(intent);
            } catch (Exception e) {
                FileLog.e("wear-auth: failed to pop LaunchActivity", e);
            }
        }
        AndroidUtilities.runOnUIThread(new z8(str, str2, bArr, 29));
    }
}
