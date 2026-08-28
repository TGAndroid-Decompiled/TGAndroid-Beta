package bg;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.z8;
public final class f2 extends LinearLayout {
    public final ArrayList f1758a;
    public final a2 f1759b;
    public final FrameLayout f1760c;
    public final FrameLayout d;
    public final l80 f1761e;

    public f2(Context context) {
        super(context);
        this.f1758a = new ArrayList();
        setOrientation(1);
        setClipChildren(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f1760c = frameLayout;
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.d = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout.addView(frameLayout2, e6.d(-1, 70.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        ImageView imageView = new ImageView(frameLayout3.getContext());
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        imageView.setColorFilter(f6.w0(null, f6.E6, false));
        frameLayout3.addView(imageView);
        frameLayout.addView(frameLayout3, e6.e(24, 24, 17));
        a2 a2Var = new a2(context);
        this.f1759b = a2Var;
        a2Var.setLayerType(2, null);
        frameLayout.addView(a2Var, e6.e(70, 70, 17));
        addView(frameLayout, e6.k(0.0f, 15.0f, 0.0f, 0.0f, -1, 70));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.BoostingReassignBoost));
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(f6.w0(null, f6.G6, false));
        addView(textView, e6.t(-2, -2, 1, 0, 15, 0, 7));
        l80 l80Var = new l80(getContext(), null);
        this.f1761e = l80Var;
        l80Var.setTextSize(1, 14.0f);
        l80Var.setGravity(1);
        l80Var.setTextColor(f6.w0(null, f6.f23108j5, false));
        l80Var.setLineSpacing(l80Var.getLineSpacingExtra(), l80Var.getLineSpacingMultiplier() * 1.1f);
        addView(l80Var, e6.t(-2, -2, 1, 28, 0, 28, 18));
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        ArrayList arrayList2;
        FrameLayout frameLayout;
        a2 a2Var;
        int i9;
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
        gr grVar = gr.f28844f;
        int size2 = arrayList3.size();
        int i13 = 0;
        while (true) {
            arrayList2 = this.f1758a;
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
            a2 a2Var2 = (a2) frameLayout.getChildAt(i15);
            if (a2Var2.getTag() == null) {
                arrayList6.add(a2Var2);
            }
            i15++;
        }
        int size4 = arrayList5.size();
        int i16 = 0;
        while (i16 < size4) {
            Object obj4 = arrayList5.get(i16);
            i16++;
            TLRPC.Chat chat4 = (TLRPC.Chat) obj4;
            a2 a2Var3 = new a2(getContext());
            a2Var3.setLayerType(2, null);
            a2Var3.d = chat4;
            z8 z8Var = a2Var3.f1698e;
            z8Var.q(chat4);
            a2Var3.f1695a.e(chat4, z8Var);
            int size5 = arrayList6.size();
            frameLayout.addView(a2Var3, i11, e6.e(70, 70, 17));
            a2Var3.setTranslationX(AndroidUtilities.dp(23.0f) * (-size5));
            a2Var3.setAlpha(0.0f);
            a2Var3.setScaleX(0.1f);
            a2Var3.setScaleY(0.1f);
            ArrayList arrayList7 = arrayList5;
            a2Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setInterpolator(grVar).setDuration(200).start();
            if (size5 == 0) {
                b2 b2Var = a2Var3.f1696b;
                b2Var.setScaleY(1.0f);
                b2Var.setScaleX(1.0f);
                b2Var.setAlpha(1.0f);
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
            while (true) {
                if (i18 < size7) {
                    Object obj6 = arrayList6.get(i18);
                    i18++;
                    a2Var = (a2) obj6;
                    if (a2Var.d == chat5) {
                        break;
                    }
                } else {
                    a2Var = null;
                    break;
                }
            }
            if (a2Var != null) {
                a2Var.setTag("REMOVED");
                long j10 = 200;
                a2Var.animate().alpha(0.0f).translationXBy(AndroidUtilities.dp(23.0f)).scaleX(0.1f).scaleY(0.1f).setInterpolator(grVar).setDuration(j10).setListener(new e2(this, a2Var)).start();
                int size8 = arrayList6.size();
                int i19 = 0;
                int i20 = 0;
                while (i19 < size8) {
                    Object obj7 = arrayList6.get(i19);
                    i19++;
                    a2 a2Var4 = (a2) obj7;
                    int size9 = arrayList6.size() - 1;
                    if (a2Var4 != a2Var) {
                        i20++;
                        i10 = size6;
                        a2Var4.animate().translationX((-(size9 - i20)) * AndroidUtilities.dp(23.0f)).setInterpolator(grVar).setDuration(j10).start();
                    } else {
                        i10 = size6;
                    }
                    size6 = i10;
                }
                i9 = size6;
                if (j3.r0.j(1, arrayList6) == a2Var && arrayList6.size() > 1) {
                    ((a2) j3.r0.j(2, arrayList6)).f1696b.setScaleY(0.1f);
                    ((a2) arrayList6.get(arrayList6.size() - 2)).f1696b.setScaleX(0.1f);
                    ((a2) arrayList6.get(arrayList6.size() - 2)).f1696b.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(j10).setInterpolator(grVar).start();
                    size6 = i9;
                }
            } else {
                i9 = size6;
            }
            size6 = i9;
        }
        a2 a2Var5 = this.f1759b;
        if (a2Var5.d == null) {
            a2Var5.d = chat;
            z8 z8Var2 = a2Var5.f1698e;
            z8Var2.q(chat);
            a2Var5.f1695a.e(chat, z8Var2);
        }
        arrayList2.removeAll(arrayList4);
        arrayList2.addAll(arrayList8);
        FrameLayout frameLayout2 = this.f1760c;
        frameLayout2.animate().cancel();
        if (!arrayList2.isEmpty() && arrayList2.size() != 1) {
            frameLayout2.animate().setInterpolator(grVar).translationX(AndroidUtilities.dp(11.5f) * (arrayList2.size() - 1)).setDuration(200).start();
        } else {
            frameLayout2.animate().setInterpolator(grVar).translationX(0.0f).setDuration(200).start();
        }
        a2Var5.animate().cancel();
        frameLayout.animate().cancel();
        if (arrayList2.isEmpty()) {
            long j11 = 200;
            frameLayout.animate().setInterpolator(grVar).translationX(0.0f).setDuration(j11).start();
            a2Var5.animate().setInterpolator(grVar).translationX(0.0f).setDuration(j11).start();
            return;
        }
        long j12 = 200;
        frameLayout.animate().setInterpolator(grVar).translationX(-AndroidUtilities.dp(48.0f)).setDuration(j12).start();
        a2Var5.animate().setInterpolator(grVar).translationX(AndroidUtilities.dp(48.0f)).setDuration(j12).start();
    }
}
