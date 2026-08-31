package hg;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.z8;
public final class v1 extends LinearLayout {
    public final ArrayList f7628a;
    public final s1 f7629b;
    public final FrameLayout f7630c;
    public final FrameLayout d;
    public final g90 f7631e;

    public v1(Context context) {
        super(context);
        this.f7628a = new ArrayList();
        setOrientation(1);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f7630c = frameLayout;
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.d = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout.addView(frameLayout2, c6.d(-1, 70.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        ImageView imageView = new ImageView(frameLayout3.getContext());
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        imageView.setColorFilter(k6.w0(null, k6.E6, false));
        frameLayout3.addView(imageView);
        frameLayout.addView(frameLayout3, c6.e(24, 24, 17));
        s1 s1Var = new s1(context);
        this.f7629b = s1Var;
        s1Var.setLayerType(2, null);
        frameLayout.addView(s1Var, c6.e(70, 70, 17));
        addView(frameLayout, c6.k(0.0f, 15.0f, 0.0f, 0.0f, -1, 70));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.BoostingReassignBoost));
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(k6.w0(null, k6.G6, false));
        addView(textView, c6.t(-2, -2, 1, 0, 15, 0, 7));
        g90 g90Var = new g90(getContext(), null);
        this.f7631e = g90Var;
        g90Var.setTextSize(1, 14.0f);
        g90Var.setGravity(1);
        g90Var.setTextColor(k6.w0(null, k6.f21766j5, false));
        g90Var.setLineSpacing(g90Var.getLineSpacingExtra(), g90Var.getLineSpacingMultiplier() * 1.1f);
        addView(g90Var, c6.t(-2, -2, 1, 28, 0, 28, 18));
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        ArrayList arrayList2;
        FrameLayout frameLayout;
        s1 s1Var;
        int i10;
        int i11;
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            arrayList3.add(MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(((TL_stories.TL_myBoost) obj).peer))));
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        pr prVar = pr.f30183f;
        int size2 = arrayList3.size();
        int i14 = 0;
        while (true) {
            arrayList2 = this.f7628a;
            if (i14 >= size2) {
                break;
            }
            Object obj2 = arrayList3.get(i14);
            i14++;
            TLRPC.Chat chat2 = (TLRPC.Chat) obj2;
            if (!arrayList2.contains(chat2)) {
                arrayList5.add(chat2);
            }
        }
        int size3 = arrayList2.size();
        int i15 = 0;
        while (i15 < size3) {
            Object obj3 = arrayList2.get(i15);
            i15++;
            TLRPC.Chat chat3 = (TLRPC.Chat) obj3;
            if (!arrayList3.contains(chat3)) {
                arrayList4.add(chat3);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        int i16 = 0;
        while (true) {
            frameLayout = this.d;
            if (i16 >= frameLayout.getChildCount()) {
                break;
            }
            s1 s1Var2 = (s1) frameLayout.getChildAt(i16);
            if (s1Var2.getTag() == null) {
                arrayList6.add(s1Var2);
            }
            i16++;
        }
        int size4 = arrayList5.size();
        int i17 = 0;
        while (i17 < size4) {
            Object obj4 = arrayList5.get(i17);
            i17++;
            TLRPC.Chat chat4 = (TLRPC.Chat) obj4;
            s1 s1Var3 = new s1(getContext());
            s1Var3.setLayerType(2, null);
            s1Var3.d = chat4;
            z8 z8Var = s1Var3.f7605e;
            z8Var.q(chat4);
            s1Var3.f7602a.e(chat4, z8Var);
            int size5 = arrayList6.size();
            frameLayout.addView(s1Var3, i12, c6.e(70, 70, 17));
            s1Var3.setTranslationX(AndroidUtilities.dp(23.0f) * (-size5));
            s1Var3.setAlpha(0.0f);
            s1Var3.setScaleX(0.1f);
            s1Var3.setScaleY(0.1f);
            ArrayList arrayList7 = arrayList5;
            s1Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setInterpolator(prVar).setDuration(200).start();
            if (size5 == 0) {
                t1 t1Var = s1Var3.f7603b;
                t1Var.setScaleY(1.0f);
                t1Var.setScaleX(1.0f);
                t1Var.setAlpha(1.0f);
            }
            arrayList5 = arrayList7;
            i12 = 0;
        }
        ArrayList arrayList8 = arrayList5;
        int size6 = arrayList4.size();
        int i18 = 0;
        while (i18 < size6) {
            Object obj5 = arrayList4.get(i18);
            i18++;
            TLRPC.Chat chat5 = (TLRPC.Chat) obj5;
            int size7 = arrayList6.size();
            int i19 = 0;
            while (true) {
                if (i19 < size7) {
                    Object obj6 = arrayList6.get(i19);
                    i19++;
                    s1Var = (s1) obj6;
                    if (s1Var.d == chat5) {
                        break;
                    }
                } else {
                    s1Var = null;
                    break;
                }
            }
            if (s1Var != null) {
                s1Var.setTag("REMOVED");
                long j10 = 200;
                s1Var.animate().alpha(0.0f).translationXBy(AndroidUtilities.dp(23.0f)).scaleX(0.1f).scaleY(0.1f).setInterpolator(prVar).setDuration(j10).setListener(new u1(this, s1Var)).start();
                int size8 = arrayList6.size();
                int i20 = 0;
                int i21 = 0;
                while (i20 < size8) {
                    Object obj7 = arrayList6.get(i20);
                    i20++;
                    s1 s1Var4 = (s1) obj7;
                    int size9 = arrayList6.size() - 1;
                    if (s1Var4 != s1Var) {
                        i21++;
                        i11 = size6;
                        s1Var4.animate().translationX((-(size9 - i21)) * AndroidUtilities.dp(23.0f)).setInterpolator(prVar).setDuration(j10).start();
                    } else {
                        i11 = size6;
                    }
                    size6 = i11;
                }
                i10 = size6;
                if (l.d.i(1, arrayList6) == s1Var && arrayList6.size() > 1) {
                    ((s1) l.d.i(2, arrayList6)).f7603b.setScaleY(0.1f);
                    ((s1) arrayList6.get(arrayList6.size() - 2)).f7603b.setScaleX(0.1f);
                    ((s1) arrayList6.get(arrayList6.size() - 2)).f7603b.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(j10).setInterpolator(prVar).start();
                    size6 = i10;
                }
            } else {
                i10 = size6;
            }
            size6 = i10;
        }
        s1 s1Var5 = this.f7629b;
        if (s1Var5.d == null) {
            s1Var5.d = chat;
            z8 z8Var2 = s1Var5.f7605e;
            z8Var2.q(chat);
            s1Var5.f7602a.e(chat, z8Var2);
        }
        arrayList2.removeAll(arrayList4);
        arrayList2.addAll(arrayList8);
        FrameLayout frameLayout2 = this.f7630c;
        frameLayout2.animate().cancel();
        if (!arrayList2.isEmpty() && arrayList2.size() != 1) {
            frameLayout2.animate().setInterpolator(prVar).translationX(AndroidUtilities.dp(11.5f) * (arrayList2.size() - 1)).setDuration(200).start();
        } else {
            frameLayout2.animate().setInterpolator(prVar).translationX(0.0f).setDuration(200).start();
        }
        s1Var5.animate().cancel();
        frameLayout.animate().cancel();
        if (arrayList2.isEmpty()) {
            long j11 = 200;
            frameLayout.animate().setInterpolator(prVar).translationX(0.0f).setDuration(j11).start();
            s1Var5.animate().setInterpolator(prVar).translationX(0.0f).setDuration(j11).start();
            return;
        }
        long j12 = 200;
        frameLayout.animate().setInterpolator(prVar).translationX(-AndroidUtilities.dp(48.0f)).setDuration(j12).start();
        s1Var5.animate().setInterpolator(prVar).translationX(AndroidUtilities.dp(48.0f)).setDuration(j12).start();
    }
}
