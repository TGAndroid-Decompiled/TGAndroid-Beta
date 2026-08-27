package cg;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.y8;

public final class y1 extends LinearLayout {

    public final ArrayList f2864a;

    public final u1 f2865b;

    public final FrameLayout f2866c;
    public final FrameLayout d;

    public final p80 f2867e;

    public y1(Context context) {
        super(context);
        this.f2864a = new ArrayList();
        setOrientation(1);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f2866c = frameLayout;
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.d = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout.addView(frameLayout2, z5.d(-1, 70.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        t1 t1Var = new t1(context);
        ImageView imageView = new ImageView(t1Var.getContext());
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        imageView.setColorFilter(g6.w0(null, g6.E6, false));
        t1Var.addView(imageView);
        frameLayout.addView(t1Var, z5.e(24, 24, 17));
        u1 u1Var = new u1(context);
        this.f2865b = u1Var;
        u1Var.setLayerType(2, null);
        frameLayout.addView(u1Var, z5.e(70, 70, 17));
        addView(frameLayout, z5.k(0.0f, 15.0f, 0.0f, 0.0f, -1, 70));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.BoostingReassignBoost));
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(g6.w0(null, g6.G6, false));
        addView(textView, z5.t(-2, -2, 1, 0, 15, 0, 7));
        p80 p80Var = new p80(getContext(), null);
        this.f2867e = p80Var;
        p80Var.setTextSize(1, 14.0f);
        p80Var.setGravity(1);
        p80Var.setTextColor(g6.w0(null, g6.f23161j5, false));
        p80Var.setLineSpacing(p80Var.getLineSpacingExtra(), p80Var.getLineSpacingMultiplier() * 1.1f);
        addView(p80Var, z5.t(-2, -2, 1, 28, 0, 28, 18));
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        ArrayList arrayList2;
        FrameLayout frameLayout;
        u1 u1Var;
        int i10;
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            arrayList3.add(MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(((TL_stories.TL_myBoost) obj).peer))));
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        er erVar = er.f28122f;
        int size2 = arrayList3.size();
        int i13 = 0;
        while (true) {
            arrayList2 = this.f2864a;
            if (i13 >= size2) {
                break;
            }
            Object obj2 = arrayList3.get(i13);
            i13++;
            TLRPC.Chat chat2 = (TLRPC.Chat) obj2;
            if (!arrayList2.contains(chat2)) {
                arrayList5.add(chat2);
            }
        }
        int size3 = arrayList2.size();
        int i14 = 0;
        while (i14 < size3) {
            Object obj3 = arrayList2.get(i14);
            i14++;
            TLRPC.Chat chat3 = (TLRPC.Chat) obj3;
            if (!arrayList3.contains(chat3)) {
                arrayList4.add(chat3);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        int i15 = 0;
        while (true) {
            frameLayout = this.d;
            if (i15 >= frameLayout.getChildCount()) {
                break;
            }
            u1 u1Var2 = (u1) frameLayout.getChildAt(i15);
            if (u1Var2.getTag() == null) {
                arrayList6.add(u1Var2);
            }
            i15++;
        }
        int size4 = arrayList5.size();
        int i16 = 0;
        while (i16 < size4) {
            Object obj4 = arrayList5.get(i16);
            i16++;
            TLRPC.Chat chat4 = (TLRPC.Chat) obj4;
            u1 u1Var3 = new u1(getContext());
            u1Var3.setLayerType(2, null);
            u1Var3.d = chat4;
            y8 y8Var = u1Var3.f2833e;
            y8Var.q(chat4);
            u1Var3.f2830a.e(chat4, y8Var);
            int size5 = arrayList6.size();
            frameLayout.addView(u1Var3, i11, z5.e(70, 70, 17));
            u1Var3.setTranslationX(AndroidUtilities.dp(23.0f) * (-size5));
            u1Var3.setAlpha(0.0f);
            u1Var3.setScaleX(0.1f);
            u1Var3.setScaleY(0.1f);
            ArrayList arrayList7 = arrayList5;
            u1Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setInterpolator(erVar).setDuration(200).start();
            if (size5 == 0) {
                v1 v1Var = u1Var3.f2831b;
                v1Var.setScaleY(1.0f);
                v1Var.setScaleX(1.0f);
                v1Var.setAlpha(1.0f);
            }
            arrayList5 = arrayList7;
            i11 = 0;
        }
        ArrayList arrayList8 = arrayList5;
        int size6 = arrayList4.size();
        int i17 = 0;
        while (i17 < size6) {
            Object obj5 = arrayList4.get(i17);
            i17++;
            TLRPC.Chat chat5 = (TLRPC.Chat) obj5;
            int size7 = arrayList6.size();
            int i18 = 0;
            do {
                if (i18 >= size7) {
                    u1Var = null;
                    break;
                } else {
                    Object obj6 = arrayList6.get(i18);
                    i18++;
                    u1Var = (u1) obj6;
                }
            } while (u1Var.d != chat5);
            if (u1Var != null) {
                u1Var.setTag("REMOVED");
                long j10 = 200;
                u1Var.animate().alpha(0.0f).translationXBy(AndroidUtilities.dp(23.0f)).scaleX(0.1f).scaleY(0.1f).setInterpolator(erVar).setDuration(j10).setListener(new x1(this, u1Var)).start();
                int size8 = arrayList6.size();
                int i19 = 0;
                int i20 = 0;
                while (i19 < size8) {
                    Object obj7 = arrayList6.get(i19);
                    i19++;
                    u1 u1Var4 = (u1) obj7;
                    int size9 = arrayList6.size() - 1;
                    if (u1Var4 != u1Var) {
                        i20++;
                        u1Var4.animate().translationX((-(size9 - i20)) * AndroidUtilities.dp(23.0f)).setInterpolator(erVar).setDuration(j10).start();
                    }
                    size6 = size6;
                }
                i10 = size6;
                if (i0.a.i(1, arrayList6) == u1Var && arrayList6.size() > 1) {
                    ((u1) i0.a.i(2, arrayList6)).f2831b.setScaleY(0.1f);
                    ((u1) arrayList6.get(arrayList6.size() - 2)).f2831b.setScaleX(0.1f);
                    ((u1) arrayList6.get(arrayList6.size() - 2)).f2831b.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(j10).setInterpolator(erVar).start();
                }
                size6 = i10;
            } else {
                i10 = size6;
            }
            size6 = i10;
        }
        u1 u1Var5 = this.f2865b;
        if (u1Var5.d == null) {
            u1Var5.d = chat;
            y8 y8Var2 = u1Var5.f2833e;
            y8Var2.q(chat);
            u1Var5.f2830a.e(chat, y8Var2);
        }
        arrayList2.removeAll(arrayList4);
        arrayList2.addAll(arrayList8);
        FrameLayout frameLayout2 = this.f2866c;
        frameLayout2.animate().cancel();
        if (arrayList2.isEmpty() || arrayList2.size() == 1) {
            frameLayout2.animate().setInterpolator(erVar).translationX(0.0f).setDuration(200).start();
        } else {
            frameLayout2.animate().setInterpolator(erVar).translationX(AndroidUtilities.dp(11.5f) * (arrayList2.size() - 1)).setDuration(200).start();
        }
        u1Var5.animate().cancel();
        frameLayout.animate().cancel();
        if (arrayList2.isEmpty()) {
            long j11 = 200;
            frameLayout.animate().setInterpolator(erVar).translationX(0.0f).setDuration(j11).start();
            u1Var5.animate().setInterpolator(erVar).translationX(0.0f).setDuration(j11).start();
        } else {
            long j12 = 200;
            frameLayout.animate().setInterpolator(erVar).translationX(-AndroidUtilities.dp(48.0f)).setDuration(j12).start();
            u1Var5.animate().setInterpolator(erVar).translationX(AndroidUtilities.dp(48.0f)).setDuration(j12).start();
        }
    }
}
