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
import org.telegram.ui.pj1;
import org.telegram.ui.w71;
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
            BigInteger bigInteger = pj1.f35852a;
            FileLog.d("wear-auth: cancel received; dropping session and dismissing sheet");
            pj1.d = null;
            org.telegram.ui.ActionBar.h3 h3Var = pj1.f35854c;
            if (h3Var != null) {
                h3Var.dismiss();
                pj1.f35854c = null;
                return;
            }
            return;
        }
        StringBuilder v = a4.a.v("wear-auth: offer from ", str2, " (");
        v.append(bArr.length);
        v.append(" bytes)");
        FileLog.d(v.toString());
        BigInteger bigInteger2 = pj1.f35852a;
        if (bArr.length != 272) {
            FileLog.d("wear-auth: malformed offer (" + bArr.length + ")");
            return;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        bi.u6 u6Var = pj1.d;
        if (u6Var != null && Arrays.equals((byte[]) u6Var.f3719a, copyOfRange)) {
            FileLog.d("wear-auth: duplicate offer (same sessionId) — ignoring");
            return;
        }
        FileLog.d("wear-auth: new session " + pj1.d(copyOfRange) + " from " + str2);
        ?? obj = new Object();
        obj.f3719a = copyOfRange;
        obj.f3720b = copyOfRange2;
        obj.f3721c = str2;
        pj1.d = obj;
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context != null) {
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (U != null) {
                f6Var = U.getResourceProvider();
            } else {
                f6Var = null;
            }
            org.telegram.ui.ActionBar.h3 h3Var2 = pj1.f35854c;
            if (h3Var2 != null) {
                h3Var2.dismiss();
                pj1.f35854c = null;
            }
            org.telegram.ui.ActionBar.h3 i10 = em.i(1, context, f6Var, false);
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
            Collections.sort(arrayList, new org.telegram.ui.Components.m9(25));
            if (arrayList.isEmpty()) {
                return;
            }
            FrameLayout frameLayout2 = new FrameLayout(context);
            int i13 = i11;
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18016i5, f6Var)));
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
            w9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
            w9Var.getImageReceiver().setCrossfadeWithOldImage(true);
            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
            int[] iArr = {UserConfig.selectedAccount};
            TLRPC.User currentUser = UserConfig.getInstance(iArr[0]).getCurrentUser();
            g9Var.r(currentUser);
            w9Var.e(currentUser, g9Var);
            frameLayout3.addView(w9Var, w7.a6.e(28, 28, 115));
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18179r5, f6Var), PorterDuff.Mode.SRC_IN));
            imageView.setImageResource(R.drawable.arrows_select);
            frameLayout3.addView(imageView, w7.a6.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
            frameLayout2.addView(frameLayout3, w7.a6.e(52, 28, 17));
            frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
            frameLayout.addView(frameLayout2, w7.a6.p(-2, -2, 0.0f, 51, 6, 4, 6, 0));
            w7.c6.a(frameLayout2);
            if (arrayList.size() <= 1) {
                frameLayout2.setVisibility(8);
            }
            LinearLayout f7 = em.f(context, 1);
            frameLayout.addView(f7, w7.a6.e(-1, -1, 119));
            org.telegram.ui.Components.w9 w9Var2 = new org.telegram.ui.Components.w9(context);
            f7.addView(w9Var2, w7.a6.r(130, 130, 49, 32.0f, 32.0f, 32.0f, 9.66f));
            MediaDataController.getInstance(i13).setPlaceholderImage(w9Var2, "Utya3D", "😎", "130_130");
            int i14 = org.telegram.ui.ActionBar.j6.f18034j5;
            TextView b10 = w7.e6.b(context, 20.0f, i14, true, f6Var);
            b10.setGravity(17);
            b10.setText(LocaleController.getString(R.string.WearAuthTitle));
            f7.addView(b10, w7.a6.r(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
            TextView b11 = w7.e6.b(context, 14.0f, i14, false, null);
            b11.setGravity(17);
            b11.setText(LocaleController.getString(R.string.WearAuthText));
            f7.addView(b11, w7.a6.t(-1, -2, 49, 32, 0, 32, 24));
            bi.d g10 = em.g(24, context, f6Var, true);
            g10.setText(LocaleController.getString(R.string.Next));
            f7.addView(g10, w7.a6.t(-1, 48, 7, 12, 12, 12, 8));
            int i15 = org.telegram.ui.ActionBar.j6.f17872a7;
            i10.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i15, f6Var));
            i10.fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(i15, f6Var));
            frameLayout2.setOnClickListener(new org.telegram.ui.Components.o0(i10, frameLayout3, arrayList, iArr, g9Var, w9Var, 4));
            g10.setOnClickListener(new w71(8, g10, iArr));
            pj1.f35854c = i10;
            i10.show();
        }
    }

    @Override
    public void onMessageReceived(x8.g gVar) {
        y8.k0 k0Var = (y8.k0) gVar;
        String str = k0Var.f46532b;
        String str2 = k0Var.d;
        byte[] bArr = k0Var.f46533c;
        if ("/tg-wear-auth/offer".equals(str)) {
            try {
                Intent intent = new Intent(this, LaunchActivity.class);
                intent.addFlags(268566528);
                startActivity(intent);
            } catch (Exception e) {
                FileLog.e("wear-auth: failed to pop LaunchActivity", e);
            }
        }
        AndroidUtilities.runOnUIThread(new g9(str, str2, bArr, 29));
    }
}
