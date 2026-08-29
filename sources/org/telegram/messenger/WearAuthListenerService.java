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
import org.telegram.ui.Components.wp0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ei1;
import org.telegram.ui.t70;
public class WearAuthListenerService extends j8.k {
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
            BigInteger bigInteger = ei1.f37844a;
            FileLog.d("wear-auth: cancel received; dropping session and dismissing sheet");
            ei1.d = null;
            org.telegram.ui.ActionBar.f3 f3Var = ei1.f37846c;
            if (f3Var != null) {
                f3Var.dismiss();
                ei1.f37846c = null;
                return;
            }
            return;
        }
        StringBuilder s10 = a4.w.s("wear-auth: offer from ", str2, " (");
        s10.append(bArr.length);
        s10.append(" bytes)");
        FileLog.d(s10.toString());
        BigInteger bigInteger2 = ei1.f37844a;
        if (bArr.length != 272) {
            FileLog.d("wear-auth: malformed offer (" + bArr.length + ")");
            return;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        a5.j jVar = ei1.d;
        if (jVar != null && Arrays.equals((byte[]) jVar.f211a, copyOfRange)) {
            FileLog.d("wear-auth: duplicate offer (same sessionId) — ignoring");
            return;
        }
        FileLog.d("wear-auth: new session " + ei1.d(copyOfRange) + " from " + str2);
        ?? obj = new Object();
        obj.f211a = copyOfRange;
        obj.f212b = copyOfRange2;
        obj.f213c = str2;
        ei1.d = obj;
        Context context = LaunchActivity.C1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context != null) {
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U != null) {
                c6Var = U.getResourceProvider();
            } else {
                c6Var = null;
            }
            org.telegram.ui.ActionBar.f3 f3Var2 = ei1.f37846c;
            if (f3Var2 != null) {
                f3Var2.dismiss();
                ei1.f37846c = null;
            }
            org.telegram.ui.ActionBar.f3 q6 = x3.q(context, c6Var, false, false);
            FrameLayout frameLayout = new FrameLayout(context);
            q6.customView = frameLayout;
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
            Collections.sort(arrayList, new wp0(16));
            if (arrayList.isEmpty()) {
                return;
            }
            FrameLayout frameLayout2 = new FrameLayout(context);
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23151i5, c6Var)));
            org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
            t9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
            t9Var.getImageReceiver().setCrossfadeWithOldImage(true);
            org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
            int[] iArr = {UserConfig.selectedAccount};
            TLRPC.User currentUser = UserConfig.getInstance(iArr[0]).getCurrentUser();
            e9Var.r(currentUser);
            t9Var.e(currentUser, e9Var);
            frameLayout3.addView(t9Var, i7.f6.e(28, 28, 115));
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23310r5, c6Var), PorterDuff.Mode.SRC_IN));
            imageView.setImageResource(R.drawable.arrows_select);
            frameLayout3.addView(imageView, i7.f6.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
            frameLayout2.addView(frameLayout3, i7.f6.e(52, 28, 17));
            frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
            frameLayout.addView(frameLayout2, i7.f6.p(-2, -2, 0.0f, 51, 6, 4, 6, 0));
            i7.h6.a(frameLayout2);
            if (arrayList.size() <= 1) {
                frameLayout2.setVisibility(8);
            }
            LinearLayout g10 = x3.g(context, 1);
            frameLayout.addView(g10, i7.f6.e(-1, -1, 119));
            org.telegram.ui.Components.t9 t9Var2 = new org.telegram.ui.Components.t9(context);
            g10.addView(t9Var2, i7.f6.r(130, 130, 49, 32.0f, 32.0f, 32.0f, 9.66f));
            MediaDataController.getInstance(i10).setPlaceholderImage(t9Var2, "Utya3D", "😎", "130_130");
            int i12 = org.telegram.ui.ActionBar.g6.f23169j5;
            TextView b10 = i7.j6.b(context, 20.0f, i12, true, c6Var);
            b10.setGravity(17);
            b10.setText(LocaleController.getString(R.string.WearAuthTitle));
            g10.addView(b10, i7.f6.r(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
            TextView b11 = i7.j6.b(context, 14.0f, i12, false, null);
            b11.setGravity(17);
            b11.setText(LocaleController.getString(R.string.WearAuthText));
            g10.addView(b11, i7.f6.t(-1, -2, 49, 32, 0, 32, 24));
            nh.d o10 = x3.o(24, context, c6Var, true);
            o10.setText(LocaleController.getString(R.string.Next));
            g10.addView(o10, i7.f6.t(-1, 48, 7, 12, 12, 12, 8));
            int i13 = org.telegram.ui.ActionBar.g6.f23009a7;
            q6.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
            q6.fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
            frameLayout2.setOnClickListener(new eg.f(q6, frameLayout3, arrayList, iArr, e9Var, t9Var, 5));
            o10.setOnClickListener(new t70(29, o10, iArr));
            ei1.f37846c = q6;
            q6.show();
        }
    }

    @Override
    public void onMessageReceived(j8.g gVar) {
        k8.m0 m0Var = (k8.m0) gVar;
        String str = m0Var.f13531b;
        String str2 = m0Var.d;
        byte[] bArr = m0Var.f13532c;
        if ("/tg-wear-auth/offer".equals(str)) {
            try {
                Intent intent = new Intent(this, LaunchActivity.class);
                intent.addFlags(268566528);
                startActivity(intent);
            } catch (Exception e10) {
                FileLog.e("wear-auth: failed to pop LaunchActivity", e10);
            }
        }
        AndroidUtilities.runOnUIThread(new c9(str, str2, bArr));
    }
}
