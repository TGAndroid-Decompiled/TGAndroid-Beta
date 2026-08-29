package eg;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
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
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.y80;
public final class w1 extends LinearLayout {
    public final ArrayList f6158a;
    public final t1 f6159b;
    public final FrameLayout f6160c;
    public final FrameLayout d;
    public final y80 f6161e;

    public w1(Context context) {
        super(context);
        this.f6158a = new ArrayList();
        setOrientation(1);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f6160c = frameLayout;
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.d = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout.addView(frameLayout2, f6.d(-1, 70.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        ImageView imageView = new ImageView(frameLayout3.getContext());
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        imageView.setColorFilter(g6.w0(null, g6.E6, false));
        frameLayout3.addView(imageView);
        frameLayout.addView(frameLayout3, f6.e(24, 24, 17));
        t1 t1Var = new t1(context);
        this.f6159b = t1Var;
        t1Var.setLayerType(2, null);
        frameLayout.addView(t1Var, f6.e(70, 70, 17));
        addView(frameLayout, f6.k(0.0f, 15.0f, 0.0f, 0.0f, -1, 70));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.BoostingReassignBoost));
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(g6.w0(null, g6.G6, false));
        addView(textView, f6.t(-2, -2, 1, 0, 15, 0, 7));
        y80 y80Var = new y80(getContext(), null);
        this.f6161e = y80Var;
        y80Var.setTextSize(1, 14.0f);
        y80Var.setGravity(1);
        y80Var.setTextColor(g6.w0(null, g6.f23169j5, false));
        y80Var.setLineSpacing(y80Var.getLineSpacingExtra(), y80Var.getLineSpacingMultiplier() * 1.1f);
        addView(y80Var, f6.t(-2, -2, 1, 28, 0, 28, 18));
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        ArrayList arrayList2;
        FrameLayout frameLayout;
        t1 t1Var;
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
        jr jrVar = jr.f29800f;
        int size2 = arrayList3.size();
        int i14 = 0;
        while (true) {
            arrayList2 = this.f6158a;
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
            t1 t1Var2 = (t1) frameLayout.getChildAt(i16);
            if (t1Var2.getTag() == null) {
                arrayList6.add(t1Var2);
            }
            i16++;
        }
        int size4 = arrayList5.size();
        int i17 = 0;
        while (i17 < size4) {
            Object obj4 = arrayList5.get(i17);
            i17++;
            TLRPC.Chat chat4 = (TLRPC.Chat) obj4;
            t1 t1Var3 = new t1(getContext());
            t1Var3.setLayerType(2, null);
            t1Var3.d = chat4;
            e9 e9Var = t1Var3.f6136e;
            e9Var.q(chat4);
            t1Var3.f6133a.e(chat4, e9Var);
            int size5 = arrayList6.size();
            frameLayout.addView(t1Var3, i12, f6.e(70, 70, 17));
            t1Var3.setTranslationX(AndroidUtilities.dp(23.0f) * (-size5));
            t1Var3.setAlpha(0.0f);
            t1Var3.setScaleX(0.1f);
            t1Var3.setScaleY(0.1f);
            ArrayList arrayList7 = arrayList5;
            t1Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setInterpolator(jrVar).setDuration(200).start();
            if (size5 == 0) {
                u1 u1Var = t1Var3.f6134b;
                u1Var.setScaleY(1.0f);
                u1Var.setScaleX(1.0f);
                u1Var.setAlpha(1.0f);
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
                    t1Var = (t1) obj6;
                    if (t1Var.d == chat5) {
                        break;
                    }
                } else {
                    t1Var = null;
                    break;
                }
            }
            if (t1Var != null) {
                t1Var.setTag("REMOVED");
                long j10 = 200;
                t1Var.animate().alpha(0.0f).translationXBy(AndroidUtilities.dp(23.0f)).scaleX(0.1f).scaleY(0.1f).setInterpolator(jrVar).setDuration(j10).setListener(new v1(this, t1Var)).start();
                int size8 = arrayList6.size();
                int i20 = 0;
                int i21 = 0;
                while (i20 < size8) {
                    Object obj7 = arrayList6.get(i20);
                    i20++;
                    t1 t1Var4 = (t1) obj7;
                    int size9 = arrayList6.size() - 1;
                    if (t1Var4 != t1Var) {
                        i21++;
                        i11 = size6;
                        t1Var4.animate().translationX((-(size9 - i21)) * AndroidUtilities.dp(23.0f)).setInterpolator(jrVar).setDuration(j10).start();
                    } else {
                        i11 = size6;
                    }
                    size6 = i11;
                }
                i10 = size6;
                if (j7.l1.i(1, arrayList6) == t1Var && arrayList6.size() > 1) {
                    ((t1) j7.l1.i(2, arrayList6)).f6134b.setScaleY(0.1f);
                    ((t1) arrayList6.get(arrayList6.size() - 2)).f6134b.setScaleX(0.1f);
                    ((t1) arrayList6.get(arrayList6.size() - 2)).f6134b.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(j10).setInterpolator(jrVar).start();
                    size6 = i10;
                }
            } else {
                i10 = size6;
            }
            size6 = i10;
        }
        t1 t1Var5 = this.f6159b;
        if (t1Var5.d == null) {
            t1Var5.d = chat;
            e9 e9Var2 = t1Var5.f6136e;
            e9Var2.q(chat);
            t1Var5.f6133a.e(chat, e9Var2);
        }
        arrayList2.removeAll(arrayList4);
        arrayList2.addAll(arrayList8);
        FrameLayout frameLayout2 = this.f6160c;
        frameLayout2.animate().cancel();
        if (!arrayList2.isEmpty() && arrayList2.size() != 1) {
            frameLayout2.animate().setInterpolator(jrVar).translationX(AndroidUtilities.dp(11.5f) * (arrayList2.size() - 1)).setDuration(200).start();
        } else {
            frameLayout2.animate().setInterpolator(jrVar).translationX(0.0f).setDuration(200).start();
        }
        t1Var5.animate().cancel();
        frameLayout.animate().cancel();
        if (arrayList2.isEmpty()) {
            long j11 = 200;
            frameLayout.animate().setInterpolator(jrVar).translationX(0.0f).setDuration(j11).start();
            t1Var5.animate().setInterpolator(jrVar).translationX(0.0f).setDuration(j11).start();
            return;
        }
        long j12 = 200;
        frameLayout.animate().setInterpolator(jrVar).translationX(-AndroidUtilities.dp(48.0f)).setDuration(j12).start();
        t1Var5.animate().setInterpolator(jrVar).translationX(AndroidUtilities.dp(48.0f)).setDuration(j12).start();
    }
}
