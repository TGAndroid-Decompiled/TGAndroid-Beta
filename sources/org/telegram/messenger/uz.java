package org.telegram.messenger;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fk0;
import org.telegram.ui.un0;
import org.telegram.ui.vc1;
public final class uz implements Runnable {
    public final int f25921a;
    public final Object f25922b;
    public final Object f25923c;
    public final Object d;

    public uz(Object obj, Object obj2, Object obj3, int i7) {
        this.f25921a = i7;
        this.f25922b = obj;
        this.f25923c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.f6 f6Var;
        switch (this.f25921a) {
            case 0:
                ((vz) this.f25922b).q((String) this.f25923c, (Bundle) this.d);
                return;
            case 1:
                f10 f10Var = (f10) this.f25922b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f25923c;
                storyItem.detectedLng = "und";
                f10Var.getMessagesController().P1().f9971k.h(storyItem.dialogId, storyItem);
                f10Var.I.remove((d10) this.d);
                return;
            case 2:
                int[] iArr = (int[]) this.f25922b;
                Runnable runnable = (Runnable) this.d;
                Pattern pattern = Utilities.f21333a;
                int i7 = iArr[0] + 1;
                iArr[0] = i7;
                if (i7 == ((c20[]) this.f25923c).length && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                String str = (String) this.f25923c;
                String str2 = (String) this.f25922b;
                byte[] bArr = (byte[]) this.d;
                int i10 = WearAuthListenerService.f21347r;
                str.getClass();
                if (!str.equals("/tg-wear-auth/offer")) {
                    if (!str.equals("/tg-wear-auth/cancel")) {
                        a8.b("wear-auth: unexpected path ".concat(str));
                        return;
                    }
                    a8.b("wear-auth: cancel from " + str2);
                    BigInteger bigInteger = vc1.f50639a;
                    a8.b("wear-auth: cancel received; dropping session and dismissing sheet");
                    vc1.d = null;
                    org.telegram.ui.ActionBar.v2 v2Var = vc1.f50641c;
                    if (v2Var != null) {
                        v2Var.dismiss();
                        vc1.f50641c = null;
                        return;
                    }
                    return;
                }
                StringBuilder u10 = a8.p0.u("wear-auth: offer from ", str2, " (");
                u10.append(bArr.length);
                u10.append(" bytes)");
                a8.b(u10.toString());
                BigInteger bigInteger2 = vc1.f50639a;
                if (bArr.length != 272) {
                    a8.b("wear-auth: malformed offer (" + bArr.length + ")");
                    return;
                }
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
                a8.r7 r7Var = vc1.d;
                if (r7Var != null && Arrays.equals((byte[]) r7Var.f614b, copyOfRange)) {
                    a8.b("wear-auth: duplicate offer (same sessionId) — ignoring");
                    return;
                }
                a8.b("wear-auth: new session " + vc1.d(copyOfRange) + " from " + str2);
                vc1.d = new a8.r7(copyOfRange, copyOfRange2, str2);
                Context context = LaunchActivity.G1;
                if (context == null) {
                    context = t0.f25566b;
                }
                if (context != null) {
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T != null) {
                        f6Var = T.getResourceProvider();
                    } else {
                        f6Var = null;
                    }
                    org.telegram.ui.ActionBar.v2 v2Var2 = vc1.f50641c;
                    if (v2Var2 != null) {
                        v2Var2.dismiss();
                        vc1.f50641c = null;
                    }
                    org.telegram.ui.ActionBar.v2 l10 = k5.l(1, context, f6Var, false);
                    FrameLayout frameLayout = new FrameLayout(context);
                    l10.N = frameLayout;
                    int i11 = p10.f24470s0;
                    ArrayList arrayList = new ArrayList();
                    arrayList.clear();
                    for (int i12 = 0; i12 < 4; i12++) {
                        if (p10.i(i12).p()) {
                            if (!ConnectionsManager.getInstance(i12).isTestBackend()) {
                                i11 = i12;
                            }
                            arrayList.add(Integer.valueOf(i12));
                        }
                    }
                    Collections.sort(arrayList, new un0(8));
                    if (!arrayList.isEmpty()) {
                        FrameLayout frameLayout2 = new FrameLayout(context);
                        FrameLayout frameLayout3 = new FrameLayout(context);
                        int L = g0.L(14.0f);
                        int i13 = org.telegram.ui.ActionBar.k6.f27943i5;
                        Drawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i13, f6Var));
                        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i13);
                        frameLayout3.setBackground(d02);
                        org.telegram.ui.ActionBar.r6.k(frameLayout3, d02, N, null, f6Var);
                        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
                        l9Var.setRoundRadius(g0.L(14.0f));
                        l9Var.getImageReceiver().A0 = true;
                        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
                        int[] iArr2 = {p10.f24470s0};
                        TLRPC.User f10 = p10.i(iArr2[0]).f();
                        w8Var.r(f10);
                        l9Var.e(f10, w8Var);
                        frameLayout3.addView(l9Var, c8.ha.e(28, 28, 115));
                        ImageView imageView = new ImageView(context);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f28110r5, f6Var, PorterDuff.Mode.SRC_IN);
                        imageView.setImageResource(2131230873);
                        frameLayout3.addView(imageView, c8.ha.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
                        frameLayout2.addView(frameLayout3, c8.ha.e(52, 28, 17));
                        frameLayout2.setPadding(g0.L(8.0f), g0.L(4.0f), g0.L(8.0f), 0);
                        frameLayout.addView(frameLayout2, c8.ha.q(-2, -2, 0.0f, 51, 6, 4, 6, 0));
                        c8.ka.a(frameLayout2);
                        if (arrayList.size() <= 1) {
                            frameLayout2.setVisibility(8);
                        }
                        LinearLayout f11 = k5.f(context, 1);
                        frameLayout.addView(f11, c8.ha.e(-1, -1, 119));
                        org.telegram.ui.Components.l9 l9Var2 = new org.telegram.ui.Components.l9(context);
                        f11.addView(l9Var2, c8.ha.s(130, 130, 49, 32.0f, 32.0f, 32.0f, 9.66f));
                        ui.b0(i11).c2(l9Var2, "Utya3D", "😎", "130_130");
                        int i14 = org.telegram.ui.ActionBar.k6.f27960j5;
                        TextView b10 = c8.qa.b(context, 20.0f, i14, true, f6Var);
                        k5.m(b10, 17, null, 2131742947);
                        f11.addView(b10, c8.ha.s(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
                        TextView b11 = c8.qa.b(context, 14.0f, i14, false, null);
                        k5.m(b11, 17, null, 2131742948);
                        f11.addView(b11, c8.ha.t(-1, -2, 49, 32, 0, 32, 24));
                        fi.d h = k5.h(24, context, f6Var, true);
                        h.setText(id.M0(2131748251, null));
                        f11.addView(h, c8.ha.t(-1, 48, 7, 12, 12, 12, 8));
                        int i15 = org.telegram.ui.ActionBar.k6.f27796a7;
                        l10.w0(i15);
                        l10.P(i15);
                        frameLayout2.setOnClickListener(new org.telegram.ui.Components.n1(l10, frameLayout3, arrayList, iArr2, w8Var, l9Var, 4));
                        h.setOnClickListener(new fk0(23, h, iArr2));
                        vc1.f50641c = l10;
                        l10.show();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public uz(byte[] bArr, String str, String str2) {
        this.f25921a = 3;
        this.f25923c = str;
        this.f25922b = str2;
        this.d = bArr;
    }
}
