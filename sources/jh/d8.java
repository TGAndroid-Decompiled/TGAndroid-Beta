package jh;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.jv;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.sw0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cw;
public final class d8 implements Utilities.Callback {
    public final int f11956a;
    public final int f11957b;
    public final Object f11958c;
    public final Object d;
    public final Object f11959e;

    public d8(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f11956a = i11;
        this.f11958c = obj;
        this.f11957b = i10;
        this.d = obj2;
        this.f11959e = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f11956a) {
            case 0:
                vc vcVar = (vc) this.f11958c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f11959e;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(vcVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) wc.b(LocaleController.getString(R.string.StarGiftReasonUpgradeView), new ag.z1(this.f11957b, context, c6Var, savedStarGift), c6Var, null));
                    vcVar.setText(spannableStringBuilder);
                    return;
                }
                return;
            case 1:
                jv jvVar = (jv) this.f11958c;
                int[] iArr = (int[]) this.d;
                ArrayList arrayList = (ArrayList) this.f11959e;
                org.telegram.ui.ActionBar.o2 o2Var = jvVar.f29824c;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == this.f11957b && iArr[1] > 0) {
                    jvVar.dismiss();
                    mc.g(o2Var, new sw0(o2Var.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, o2Var.getResourceProvider()), 1500).j();
                    return;
                }
                return;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) this.f11958c;
                TranslateController translateController = (TranslateController) this.d;
                MessageObject messageObject = (MessageObject) this.f11959e;
                String str = (String) obj;
                if (this.f11957b == photoViewer.M4) {
                    photoViewer.f35743k5 = str;
                    if (translateController.isContextTranslateEnabled() && translateController.canTranslatePhoto(messageObject, photoViewer.f35743k5)) {
                        if (photoViewer.f35734j5) {
                            photoViewer.f35738k0.K(20);
                            photoViewer.f35738k0.r(19);
                            return;
                        }
                        photoViewer.f35738k0.K(19);
                        photoViewer.f35738k0.r(20);
                        return;
                    }
                    photoViewer.f35738k0.r(19);
                    photoViewer.f35738k0.r(20);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.f11958c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                long j10 = ((TLRPC.Chat) this.f11959e).f22392id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean isChannel = ChatObject.isChannel(chat);
                int i10 = this.f11957b;
                if (!isChannel) {
                    org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(o2Var2.getContext(), 3, null);
                    c2Var.q(250L);
                    MessagesController.getInstance(i10).convertToMegaGroup(o2Var2.getParentActivity(), chat.f22392id, o2Var2, new cw(c2Var, o2Var2, i10, j10, booleanValue));
                    return;
                }
                long j11 = chat.f22392id;
                MessagesController.getInstance(i10).linkCommunity(-j11, j10, booleanValue, new ih.m(o2Var2, j11, 3));
                return;
            default:
                th.t5 t5Var = (th.t5) this.f11958c;
                th.a aVar = (th.a) this.d;
                String str2 = (String) this.f11959e;
                SpannableString spannableString = (SpannableString) obj;
                if (this.f11957b == t5Var.E && t5Var.f48785x == aVar) {
                    Editable text = t5Var.f48780f.getText();
                    if (TextUtils.equals(str2, text)) {
                        for (CodeHighlighting.ColorSpan colorSpan : (CodeHighlighting.ColorSpan[]) text.getSpans(0, text.length(), CodeHighlighting.ColorSpan.class)) {
                            text.removeSpan(colorSpan);
                        }
                        CodeHighlighting.ColorSpan[] colorSpanArr = (CodeHighlighting.ColorSpan[]) spannableString.getSpans(0, spannableString.length(), CodeHighlighting.ColorSpan.class);
                        int length = text.length();
                        for (int i11 = 0; i11 < colorSpanArr.length; i11++) {
                            int spanStart = spannableString.getSpanStart(colorSpanArr[i11]);
                            int spanEnd = spannableString.getSpanEnd(colorSpanArr[i11]);
                            if (spanStart >= 0 && spanEnd <= length && spanStart < spanEnd) {
                                text.setSpan(colorSpanArr[i11], spanStart, spanEnd, 33);
                            }
                        }
                        t5Var.D = str2;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public d8(jv jvVar, int[] iArr, int i10, ArrayList arrayList) {
        this.f11956a = 1;
        this.f11958c = jvVar;
        this.d = iArr;
        this.f11957b = i10;
        this.f11959e = arrayList;
    }
}
