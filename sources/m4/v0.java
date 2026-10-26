package m4;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.e6;
import bi.md;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.f2;
import org.telegram.ui.Components.f4;
import org.telegram.ui.Components.g4;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.j2;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.y3;
public final class v0 implements Runnable {
    public final int f18268a;
    public final Object f18269b;
    public final Object f18270c;
    public final Object d;
    public final Object e;

    public v0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18268a = i10;
        this.f18270c = obj;
        this.d = obj2;
        this.f18269b = obj3;
        this.e = obj4;
    }

    private final void a() {
        int x02;
        int x03;
        int x04;
        int x05;
        go goVar = (go) this.f18270c;
        Context context = (Context) this.d;
        u6 u6Var = (u6) this.e;
        long j10 = goVar.V;
        final org.telegram.ui.Components.p1 p1Var = new org.telegram.ui.Components.p1(16, goVar, (View) this.f18269b);
        k5 k5Var = new k5(8);
        int i10 = y6.f23464j5;
        if (u6Var != null) {
            x02 = u6Var.e(i10);
        } else {
            x02 = y6.x0(null, i10, false);
        }
        int i11 = x02;
        int i12 = y6.f23427h5;
        if (u6Var != null) {
            x03 = u6Var.e(i12);
        } else {
            x03 = y6.x0(null, i12, false);
        }
        int i13 = x03;
        int i14 = y6.Ji;
        if (u6Var != null) {
            u6Var.e(i14);
        } else {
            y6.x0(null, i14, false);
        }
        int i15 = y6.Ni;
        if (u6Var != null) {
            u6Var.e(i15);
        } else {
            y6.x0(null, i15, false);
        }
        int i16 = y6.E8;
        if (u6Var != null) {
            u6Var.e(i16);
        } else {
            y6.x0(null, i16, false);
        }
        int i17 = y6.G8;
        if (u6Var != null) {
            u6Var.e(i17);
        } else {
            y6.x0(null, i17, false);
        }
        int i18 = y6.f23448i6;
        if (u6Var != null) {
            u6Var.e(i18);
        } else {
            y6.x0(null, i18, false);
        }
        int i19 = y6.Sh;
        if (u6Var != null) {
            x04 = u6Var.e(i19);
        } else {
            x04 = y6.x0(null, i19, false);
        }
        int i20 = y6.Oh;
        if (u6Var != null) {
            x05 = u6Var.e(i20);
        } else {
            x05 = y6.x0(null, i20, false);
        }
        if (u6Var != null) {
            u6Var.e(y6.Qh);
        } else {
            y6.x0(null, y6.Qh, false);
        }
        Pattern pattern = g5.f28420a;
        if (context == null) {
            return;
        }
        final int i21 = (int) MessagesController.getInstance(UserConfig.selectedAccount).config.pollClosePeriodMax.get(TimeUnit.SECONDS);
        final e3 e3Var = new e3(context, u6Var);
        e3Var.a();
        int i22 = x04;
        final md0 md0Var = new md0(context, u6Var);
        md0Var.setTextColor(i11);
        md0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        md0Var.setItemCount(5);
        int i23 = x05;
        final ?? md0Var2 = new md0(context, u6Var);
        md0Var2.setWrapSelectorWheel(true);
        md0Var2.setAllItemsCount(24);
        md0Var2.setItemCount(5);
        md0Var2.setTextColor(i11);
        md0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
        final ?? md0Var3 = new md0(context, u6Var);
        md0Var3.setWrapSelectorWheel(true);
        md0Var3.setAllItemsCount(60);
        md0Var3.setItemCount(5);
        md0Var3.setTextColor(i11);
        md0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        y3 y3Var = new y3(context, md0Var, md0Var2, md0Var3, 2);
        y3Var.setOrientation(1);
        frameLayout.addView(y3Var, gb1.g(-1.0f, -1));
        frameLayout.addView(new FrameLayout(context), gb1.h(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        y3Var.addView(frameLayout2, gb1.x(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.StopPollDeadlineHeader));
        textView.setTextColor(i11);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView, gb1.h(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ei.d(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        y3Var.addView(linearLayout, gb1.t(-1, -2, 1.0f, 0, 0, 23, 0, 23));
        final TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 12.0f);
        f7.V(textView2, y6.q5, u6Var);
        textView2.setGravity(17);
        final Calendar calendar = Calendar.getInstance();
        md mdVar = new md(context, 16);
        mdVar.setText(LocaleController.getString(R.string.StopPollDeadlineButton));
        gb1.c(mdVar, 0.02f, 1.2f);
        linearLayout.addView(md0Var, gb1.p(0.5f, 0, 270));
        md0Var.setMinValue(0);
        md0Var.setMaxValue(365);
        md0Var.setWrapSelectorWheel(false);
        md0Var.setFormatter(new f2(2));
        e6 e6Var = new e6(i21, md0Var, (f4) md0Var2, (g4) md0Var3, textView2);
        md0Var.setOnValueChangedListener(e6Var);
        md0Var2.setMinValue(0);
        md0Var2.setMaxValue(23);
        linearLayout.addView((View) md0Var2, gb1.p(0.2f, 0, 270));
        md0Var2.setFormatter(new f2(3));
        md0Var2.setOnValueChangedListener(e6Var);
        md0Var3.setMinValue(0);
        md0Var3.setMaxValue(59);
        md0Var3.setValue(0);
        md0Var3.setFormatter(new f2(4));
        linearLayout.addView((View) md0Var3, gb1.p(0.3f, 0, 270));
        md0Var3.setOnValueChangedListener(e6Var);
        if (j10 > 0 && j10 != 2147483646) {
            long j11 = 1000 * j10;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j11 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j11);
            if (timeInMillis >= 0) {
                md0Var3.setValue(calendar.get(12));
                md0Var2.setValue(calendar.get(11));
                md0Var.setValue(timeInMillis);
            }
        }
        final boolean[] zArr = {true};
        g5.g(null, null, 0L, i21, 3, md0Var, md0Var2, md0Var3);
        g5.e(textView2, md0Var, md0Var2, md0Var3);
        mdVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        mdVar.setGravity(17);
        mdVar.setTextColor(i22);
        mdVar.setTextSize(1, 14.0f);
        mdVar.setTypeface(AndroidUtilities.bold());
        mdVar.setBackground(o6.e(new float[]{24.0f}, i23));
        y3Var.addView(mdVar, gb1.x(-1, 48, 83, 14, 15, 14, 16));
        mdVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                Runnable runnable;
                zArr[0] = false;
                md0 md0Var4 = md0Var;
                f4 f4Var = md0Var2;
                g4 g4Var = md0Var3;
                boolean g7 = g5.g(null, null, 0L, i21, 3, md0Var4, f4Var, g4Var);
                g5.e(textView2, md0Var4, f4Var, g4Var);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(currentTimeMillis);
                calendar2.add(6, md0Var4.getValue());
                calendar2.set(11, f4Var.getValue());
                calendar2.set(12, g4Var.getValue());
                if (g7) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                p1Var.G((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                runnable = e3Var.f22601a.dismissRunnable;
                runnable.run();
            }
        });
        y3Var.addView(textView2, gb1.x(-1, -2, 83, 14, 0, 14, 16));
        e3Var.b(frameLayout);
        k3 k3Var = e3Var.f22601a;
        k3Var.show();
        k3Var.setOnDismissListener(new j2(0, k5Var, zArr));
        k3Var.setBackgroundColor(i13);
        k3Var.fixNavigationBar(i13);
    }

    private final void b() {
        lz lzVar = (lz) this.f18270c;
        TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) this.d;
        TLObject tLObject = (TLObject) this.f18269b;
        Runnable runnable = (Runnable) this.e;
        ArrayList arrayList = lzVar.f30334s;
        nz nzVar = lzVar.f30335w;
        if (nzVar.M != lzVar.f30329b) {
            return;
        }
        nzVar.L = 0;
        if (tL_messages_getStickers.emoticon.equals(lzVar.f30328a)) {
            if (!(tLObject instanceof TLRPC.TL_messages_stickers)) {
                runnable.run();
                return;
            }
            TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
            int size = arrayList.size();
            int size2 = tL_messages_stickers.stickers.size();
            for (int i10 = 0; i10 < size2; i10++) {
                TLRPC.Document document = tL_messages_stickers.stickers.get(i10);
                if (lzVar.v.indexOfKey(document.f22033id) < 0) {
                    arrayList.add(document);
                }
            }
            if (size != arrayList.size()) {
                lzVar.f30331f.put(arrayList, nzVar.N);
                if (size == 0) {
                    lzVar.h.add(arrayList);
                }
            }
        }
        runnable.run();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: m4.v0.run():void");
    }

    public v0(f0 f0Var, Object obj, Object obj2, Object obj3, int i10) {
        this.f18268a = i10;
        this.f18269b = f0Var;
        this.f18270c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
