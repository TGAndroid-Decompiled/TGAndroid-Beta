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
import org.telegram.ui.Components.jn0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.di1;
import org.telegram.ui.v80;
public class WearAuthListenerService extends h8.k {
    public static final String PATH_CANCEL = "/tg-wear-auth/cancel";
    public static final String PATH_OFFER = "/tg-wear-auth/offer";

    public static void lambda$onMessageReceived$0(String str, String str2, byte[] bArr) {
        org.telegram.ui.ActionBar.b6 b6Var;
        str.getClass();
        if (!str.equals("/tg-wear-auth/offer")) {
            if (!str.equals("/tg-wear-auth/cancel")) {
                FileLog.d("wear-auth: unexpected path ".concat(str));
                return;
            }
            FileLog.d("wear-auth: cancel from " + str2);
            BigInteger bigInteger = di1.f37551a;
            FileLog.d("wear-auth: cancel received; dropping session and dismissing sheet");
            di1.d = null;
            org.telegram.ui.ActionBar.f3 f3Var = di1.f37553c;
            if (f3Var != null) {
                f3Var.dismiss();
                di1.f37553c = null;
                return;
            }
            return;
        }
        StringBuilder t10 = aa.d.t("wear-auth: offer from ", str2, " (");
        t10.append(bArr.length);
        t10.append(" bytes)");
        FileLog.d(t10.toString());
        BigInteger bigInteger2 = di1.f37551a;
        if (bArr.length != 272) {
            FileLog.d("wear-auth: malformed offer (" + bArr.length + ")");
            return;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        b3.b bVar = di1.d;
        if (bVar != null && Arrays.equals((byte[]) bVar.f1413a, copyOfRange)) {
            FileLog.d("wear-auth: duplicate offer (same sessionId) — ignoring");
            return;
        }
        FileLog.d("wear-auth: new session " + di1.d(copyOfRange) + " from " + str2);
        ?? obj = new Object();
        obj.f1413a = copyOfRange;
        obj.f1414b = copyOfRange2;
        obj.f1415c = str2;
        di1.d = obj;
        Context context = LaunchActivity.C1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context != null) {
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U != null) {
                b6Var = U.getResourceProvider();
            } else {
                b6Var = null;
            }
            org.telegram.ui.ActionBar.f3 f3Var2 = di1.f37553c;
            if (f3Var2 != null) {
                f3Var2.dismiss();
                di1.f37553c = null;
            }
            org.telegram.ui.ActionBar.f3 j10 = ll.j(context, b6Var, false, false);
            FrameLayout frameLayout = new FrameLayout(context);
            j10.customView = frameLayout;
            int i9 = UserConfig.selectedAccount;
            ArrayList arrayList = new ArrayList();
            arrayList.clear();
            for (int i10 = 0; i10 < 4; i10++) {
                if (UserConfig.getInstance(i10).isClientActivated()) {
                    if (!ConnectionsManager.getInstance(i10).isTestBackend()) {
                        i9 = i10;
                    }
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            Collections.sort(arrayList, new jn0(18));
            if (arrayList.isEmpty()) {
                return;
            }
            FrameLayout frameLayout2 = new FrameLayout(context);
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23091i5, b6Var)));
            org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
            o9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
            o9Var.getImageReceiver().setCrossfadeWithOldImage(true);
            org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
            int[] iArr = {UserConfig.selectedAccount};
            TLRPC.User currentUser = UserConfig.getInstance(iArr[0]).getCurrentUser();
            z8Var.r(currentUser);
            o9Var.e(currentUser, z8Var);
            frameLayout3.addView(o9Var, g7.e6.e(28, 28, 115));
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23247r5, b6Var), PorterDuff.Mode.SRC_IN));
            imageView.setImageResource(R.drawable.arrows_select);
            frameLayout3.addView(imageView, g7.e6.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
            frameLayout2.addView(frameLayout3, g7.e6.e(52, 28, 17));
            frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
            frameLayout.addView(frameLayout2, g7.e6.p(-2, -2, 0.0f, 51, 6, 4, 6, 0));
            g7.g6.a(frameLayout2);
            if (arrayList.size() <= 1) {
                frameLayout2.setVisibility(8);
            }
            LinearLayout f10 = ll.f(context, 1);
            frameLayout.addView(f10, g7.e6.e(-1, -1, 119));
            org.telegram.ui.Components.o9 o9Var2 = new org.telegram.ui.Components.o9(context);
            f10.addView(o9Var2, g7.e6.r(130, 130, 49, 32.0f, 32.0f, 32.0f, 9.66f));
            MediaDataController.getInstance(i9).setPlaceholderImage(o9Var2, "Utya3D", "😎", "130_130");
            int i11 = org.telegram.ui.ActionBar.f6.f23108j5;
            TextView b10 = g7.i6.b(context, 20.0f, i11, true, b6Var);
            b10.setGravity(17);
            b10.setText(LocaleController.getString(R.string.WearAuthTitle));
            f10.addView(b10, g7.e6.r(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
            TextView b11 = g7.i6.b(context, 14.0f, i11, false, null);
            b11.setGravity(17);
            b11.setText(LocaleController.getString(R.string.WearAuthText));
            f10.addView(b11, g7.e6.t(-1, -2, 49, 32, 0, 32, 24));
            kh.d i12 = ll.i(24, context, b6Var, true);
            i12.setText(LocaleController.getString(R.string.Next));
            f10.addView(i12, g7.e6.t(-1, 48, 7, 12, 12, 12, 8));
            int i13 = org.telegram.ui.ActionBar.f6.f22947a7;
            j10.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i13, b6Var));
            j10.fixNavigationBar(org.telegram.ui.ActionBar.f6.v0(i13, b6Var));
            frameLayout2.setOnClickListener(new bg.h(j10, frameLayout3, arrayList, iArr, z8Var, o9Var, 5));
            i12.setOnClickListener(new v80(28, i12, iArr));
            di1.f37553c = j10;
            j10.show();
        }
    }

    @Override
    public void onMessageReceived(h8.g gVar) {
        i8.m0 m0Var = (i8.m0) gVar;
        String str = m0Var.f11008b;
        String str2 = m0Var.d;
        byte[] bArr = m0Var.f11009c;
        if ("/tg-wear-auth/offer".equals(str)) {
            try {
                Intent intent = new Intent(this, LaunchActivity.class);
                intent.addFlags(268566528);
                startActivity(intent);
            } catch (Exception e10) {
                FileLog.e("wear-auth: failed to pop LaunchActivity", e10);
            }
        }
        AndroidUtilities.runOnUIThread(new x8(str, str2, bArr));
    }
}
