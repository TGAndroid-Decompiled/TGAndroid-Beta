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
import org.telegram.ui.qv0;
import org.telegram.ui.sc1;
import org.telegram.ui.vc1;
public final class sz implements Runnable {
    public final int f26594a;
    public final Object f26595b;
    public final Object f26596c;
    public final Object d;

    public sz(Object obj, Object obj2, Object obj3, int i7) {
        this.f26594a = i7;
        this.f26595b = obj;
        this.f26596c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.e6 e6Var;
        switch (this.f26594a) {
            case 0:
                ((tz) this.f26595b).q((String) this.f26596c, (Bundle) this.d);
                return;
            case 1:
                c10 c10Var = (c10) this.f26595b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f26596c;
                storyItem.detectedLng = "und";
                c10Var.getMessagesController().P1().f12327k.h(storyItem.dialogId, storyItem);
                c10Var.J.remove((a10) this.d);
                return;
            case 2:
                int[] iArr = (int[]) this.f26595b;
                Runnable runnable = (Runnable) this.d;
                Pattern pattern = Utilities.f22413a;
                int i7 = iArr[0] + 1;
                iArr[0] = i7;
                if (i7 == ((z10[]) this.f26596c).length && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                String str = (String) this.f26596c;
                String str2 = (String) this.f26595b;
                byte[] bArr = (byte[]) this.d;
                int i10 = WearAuthListenerService.f22427r;
                str.getClass();
                if (!str.equals("/tg-wear-auth/offer")) {
                    if (!str.equals("/tg-wear-auth/cancel")) {
                        a8.b("wear-auth: unexpected path ".concat(str));
                        return;
                    }
                    a8.b("wear-auth: cancel from " + str2);
                    BigInteger bigInteger = vc1.f52195a;
                    a8.b("wear-auth: cancel received; dropping session and dismissing sheet");
                    vc1.d = null;
                    org.telegram.ui.ActionBar.u2 u2Var = vc1.f52197c;
                    if (u2Var != null) {
                        u2Var.dismiss();
                        vc1.f52197c = null;
                        return;
                    }
                    return;
                }
                StringBuilder u10 = a8.p0.u("wear-auth: offer from ", str2, " (");
                u10.append(bArr.length);
                u10.append(" bytes)");
                a8.b(u10.toString());
                BigInteger bigInteger2 = vc1.f52195a;
                if (bArr.length != 272) {
                    a8.b("wear-auth: malformed offer (" + bArr.length + ")");
                    return;
                }
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
                a8.r7 r7Var = vc1.d;
                if (r7Var != null && Arrays.equals((byte[]) r7Var.f617b, copyOfRange)) {
                    a8.b("wear-auth: duplicate offer (same sessionId) — ignoring");
                    return;
                }
                a8.b("wear-auth: new session " + vc1.d(copyOfRange) + " from " + str2);
                vc1.d = new a8.r7(copyOfRange, copyOfRange2, str2);
                Context context = LaunchActivity.H1;
                if (context == null) {
                    context = t0.f26600b;
                }
                if (context != null) {
                    org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                    if (T != null) {
                        e6Var = T.getResourceProvider();
                    } else {
                        e6Var = null;
                    }
                    org.telegram.ui.ActionBar.u2 u2Var2 = vc1.f52197c;
                    if (u2Var2 != null) {
                        u2Var2.dismiss();
                        vc1.f52197c = null;
                    }
                    org.telegram.ui.ActionBar.u2 k10 = k5.k(1, context, e6Var, false);
                    FrameLayout frameLayout = new FrameLayout(context);
                    k10.O = frameLayout;
                    int i11 = m10.f24934t0;
                    ArrayList arrayList = new ArrayList();
                    arrayList.clear();
                    for (int i12 = 0; i12 < 4; i12++) {
                        if (m10.i(i12).p()) {
                            if (!ConnectionsManager.getInstance(i12).isTestBackend()) {
                                i11 = i12;
                            }
                            arrayList.add(Integer.valueOf(i12));
                        }
                    }
                    Collections.sort(arrayList, new qv0(7));
                    if (!arrayList.isEmpty()) {
                        FrameLayout frameLayout2 = new FrameLayout(context);
                        FrameLayout frameLayout3 = new FrameLayout(context);
                        int L = g0.L(14.0f);
                        int i13 = org.telegram.ui.ActionBar.j6.f28940i5;
                        Drawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.w0(i13, e6Var));
                        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i13);
                        frameLayout3.setBackground(d02);
                        org.telegram.ui.ActionBar.q6.j(frameLayout3, d02, M, null, e6Var);
                        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
                        i9Var.setRoundRadius(g0.L(14.0f));
                        i9Var.getImageReceiver().B0 = true;
                        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
                        int[] iArr2 = {m10.f24934t0};
                        TLRPC.User f10 = m10.i(iArr2[0]).f();
                        t8Var.r(f10);
                        i9Var.f(f10, t8Var);
                        frameLayout3.addView(i9Var, c8.ja.e(28, 28, 115));
                        ImageView imageView = new ImageView(context);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.f29107r5, e6Var, PorterDuff.Mode.SRC_IN);
                        imageView.setImageResource(2131230873);
                        frameLayout3.addView(imageView, c8.ja.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
                        frameLayout2.addView(frameLayout3, c8.ja.e(52, 28, 17));
                        frameLayout2.setPadding(g0.L(8.0f), g0.L(4.0f), g0.L(8.0f), 0);
                        frameLayout.addView(frameLayout2, c8.ja.q(-2, -2, 0.0f, 51, 6, 4, 6, 0));
                        c8.na.a(frameLayout2);
                        if (arrayList.size() <= 1) {
                            frameLayout2.setVisibility(8);
                        }
                        LinearLayout f11 = k5.f(context, 1);
                        frameLayout.addView(f11, c8.ja.e(-1, -1, 119));
                        org.telegram.ui.Components.i9 i9Var2 = new org.telegram.ui.Components.i9(context);
                        f11.addView(i9Var2, c8.ja.s(130, 130, 49, 32.0f, 32.0f, 32.0f, 9.66f));
                        si.b0(i11).c2(i9Var2, "Utya3D", "😎", "130_130");
                        int i14 = org.telegram.ui.ActionBar.j6.f28957j5;
                        TextView b10 = c8.sa.b(context, 20.0f, i14, true, e6Var);
                        k5.l(b10, 17, null, 2131742944);
                        f11.addView(b10, c8.ja.s(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
                        TextView b11 = c8.sa.b(context, 14.0f, i14, false, null);
                        k5.l(b11, 17, null, 2131742945);
                        f11.addView(b11, c8.ja.t(-1, -2, 49, 32, 0, 32, 24));
                        hi.d g10 = i20.g(24, context, e6Var, true);
                        g10.setText(hd.M0(2131748250, null));
                        f11.addView(g10, c8.ja.t(-1, 48, 7, 12, 12, 12, 8));
                        int i15 = org.telegram.ui.ActionBar.j6.f28792a7;
                        k10.w0(i15);
                        k10.Q(i15);
                        frameLayout2.setOnClickListener(new org.telegram.ui.Components.l1(k10, frameLayout3, arrayList, iArr2, t8Var, i9Var, 4));
                        g10.setOnClickListener(new sc1(0, g10, iArr2));
                        vc1.f52197c = k10;
                        k10.show();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public sz(byte[] bArr, String str, String str2) {
        this.f26594a = 3;
        this.f26596c = str;
        this.f26595b = str2;
        this.d = bArr;
    }
}
