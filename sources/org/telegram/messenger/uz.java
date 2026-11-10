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
import org.telegram.ui.ik0;
import org.telegram.ui.xn0;
import org.telegram.ui.zc1;
public final class uz implements Runnable {
    public final int f25925a;
    public final Object f25926b;
    public final Object f25927c;
    public final Object d;

    public uz(Object obj, Object obj2, Object obj3, int i7) {
        this.f25925a = i7;
        this.f25926b = obj;
        this.f25927c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.h6 h6Var;
        switch (this.f25925a) {
            case 0:
                ((vz) this.f25926b).q((String) this.f25927c, (Bundle) this.d);
                return;
            case 1:
                f10 f10Var = (f10) this.f25926b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f25927c;
                storyItem.detectedLng = "und";
                f10Var.getMessagesController().P1().f10005k.h(storyItem.dialogId, storyItem);
                f10Var.I.remove((d10) this.d);
                return;
            case 2:
                int[] iArr = (int[]) this.f25926b;
                Runnable runnable = (Runnable) this.d;
                Pattern pattern = Utilities.f21338a;
                int i7 = iArr[0] + 1;
                iArr[0] = i7;
                if (i7 == ((c20[]) this.f25927c).length && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                String str = (String) this.f25927c;
                String str2 = (String) this.f25926b;
                byte[] bArr = (byte[]) this.d;
                int i10 = WearAuthListenerService.f21352r;
                str.getClass();
                if (!str.equals("/tg-wear-auth/offer")) {
                    if (!str.equals("/tg-wear-auth/cancel")) {
                        a8.b("wear-auth: unexpected path ".concat(str));
                        return;
                    }
                    a8.b("wear-auth: cancel from " + str2);
                    BigInteger bigInteger = zc1.f52406a;
                    a8.b("wear-auth: cancel received; dropping session and dismissing sheet");
                    zc1.d = null;
                    org.telegram.ui.ActionBar.w2 w2Var = zc1.f52408c;
                    if (w2Var != null) {
                        w2Var.dismiss();
                        zc1.f52408c = null;
                        return;
                    }
                    return;
                }
                StringBuilder u10 = a8.p0.u("wear-auth: offer from ", str2, " (");
                u10.append(bArr.length);
                u10.append(" bytes)");
                a8.b(u10.toString());
                BigInteger bigInteger2 = zc1.f52406a;
                if (bArr.length != 272) {
                    a8.b("wear-auth: malformed offer (" + bArr.length + ")");
                    return;
                }
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
                a8.r7 r7Var = zc1.d;
                if (r7Var != null && Arrays.equals((byte[]) r7Var.f614b, copyOfRange)) {
                    a8.b("wear-auth: duplicate offer (same sessionId) — ignoring");
                    return;
                }
                a8.b("wear-auth: new session " + zc1.d(copyOfRange) + " from " + str2);
                zc1.d = new a8.r7(copyOfRange, copyOfRange2, str2);
                Context context = LaunchActivity.G1;
                if (context == null) {
                    context = t0.f25570b;
                }
                if (context != null) {
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T != null) {
                        h6Var = T.getResourceProvider();
                    } else {
                        h6Var = null;
                    }
                    org.telegram.ui.ActionBar.w2 w2Var2 = zc1.f52408c;
                    if (w2Var2 != null) {
                        w2Var2.dismiss();
                        zc1.f52408c = null;
                    }
                    org.telegram.ui.ActionBar.w2 l10 = k5.l(1, context, h6Var, false);
                    FrameLayout frameLayout = new FrameLayout(context);
                    l10.N = frameLayout;
                    int i11 = p10.f24474s0;
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
                    Collections.sort(arrayList, new xn0(8));
                    if (!arrayList.isEmpty()) {
                        FrameLayout frameLayout2 = new FrameLayout(context);
                        FrameLayout frameLayout3 = new FrameLayout(context);
                        int L = g0.L(14.0f);
                        int i13 = org.telegram.ui.ActionBar.m6.f27981i5;
                        Drawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i13, h6Var));
                        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i13);
                        frameLayout3.setBackground(d02);
                        org.telegram.ui.ActionBar.t6.j(frameLayout3, d02, M, null, h6Var);
                        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
                        k9Var.setRoundRadius(g0.L(14.0f));
                        k9Var.getImageReceiver().A0 = true;
                        org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
                        int[] iArr2 = {p10.f24474s0};
                        TLRPC.User f10 = p10.i(iArr2[0]).f();
                        v8Var.r(f10);
                        k9Var.e(f10, v8Var);
                        frameLayout3.addView(k9Var, c8.ha.e(28, 28, 115));
                        ImageView imageView = new ImageView(context);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.f28148r5, h6Var, PorterDuff.Mode.SRC_IN);
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
                        org.telegram.ui.Components.k9 k9Var2 = new org.telegram.ui.Components.k9(context);
                        f11.addView(k9Var2, c8.ha.s(130, 130, 49, 32.0f, 32.0f, 32.0f, 9.66f));
                        ui.b0(i11).c2(k9Var2, "Utya3D", "😎", "130_130");
                        int i14 = org.telegram.ui.ActionBar.m6.f27998j5;
                        TextView b10 = c8.qa.b(context, 20.0f, i14, true, h6Var);
                        k5.m(b10, 17, null, 2131742944);
                        f11.addView(b10, c8.ha.s(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
                        TextView b11 = c8.qa.b(context, 14.0f, i14, false, null);
                        k5.m(b11, 17, null, 2131742945);
                        f11.addView(b11, c8.ha.t(-1, -2, 49, 32, 0, 32, 24));
                        fi.d h = k5.h(24, context, h6Var, true);
                        h.setText(id.M0(2131748250, null));
                        f11.addView(h, c8.ha.t(-1, 48, 7, 12, 12, 12, 8));
                        int i15 = org.telegram.ui.ActionBar.m6.f27834a7;
                        l10.w0(i15);
                        l10.P(i15);
                        frameLayout2.setOnClickListener(new org.telegram.ui.Components.m1(l10, frameLayout3, arrayList, iArr2, v8Var, k9Var, 4));
                        h.setOnClickListener(new ik0(22, h, iArr2));
                        zc1.f52408c = l10;
                        l10.show();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public uz(byte[] bArr, String str, String str2) {
        this.f25925a = 3;
        this.f25927c = str;
        this.f25926b = str2;
        this.d = bArr;
    }
}
