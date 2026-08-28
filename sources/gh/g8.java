package gh;

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
import org.telegram.ui.Components.dv;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rc;
import org.telegram.ui.PhotoViewer;
public final class g8 implements Utilities.Callback {
    public final int f8157a;
    public final int f8158b;
    public final Object f8159c;
    public final Object d;
    public final Object f8160e;

    public g8(Object obj, int i9, Object obj2, Object obj3, int i10) {
        this.f8157a = i10;
        this.f8159c = obj;
        this.f8158b = i9;
        this.d = obj2;
        this.f8160e = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f8157a) {
            case 0:
                qc qcVar = (qc) this.f8159c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.f8160e;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qcVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) rc.b(LocaleController.getString(R.string.StarGiftReasonUpgradeView), new c3.d(this.f8158b, context, b6Var, savedStarGift, 1), b6Var, null));
                    qcVar.setText(spannableStringBuilder);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f8159c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                long j10 = ((TLRPC.Chat) this.f8160e).f22380id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean isChannel = ChatObject.isChannel(chat);
                int i9 = this.f8158b;
                if (!isChannel) {
                    org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(o2Var.getContext(), 3, null);
                    c2Var.q(250L);
                    MessagesController.getInstance(i9).convertToMegaGroup(o2Var.getParentActivity(), chat.f22380id, o2Var, new nh.l0(c2Var, o2Var, i9, j10, booleanValue));
                    return;
                }
                long j11 = chat.f22380id;
                MessagesController.getInstance(i9).linkCommunity(-j11, j10, booleanValue, new fh.m(o2Var, j11, 1));
                return;
            case 2:
                dv dvVar = (dv) this.f8159c;
                int[] iArr = (int[]) this.d;
                ArrayList arrayList = (ArrayList) this.f8160e;
                org.telegram.ui.ActionBar.o2 o2Var2 = dvVar.f27815c;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == this.f8158b && iArr[1] > 0) {
                    dvVar.dismiss();
                    gc.g(o2Var2, new iw0(o2Var2.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, o2Var2.getResourceProvider()), 1500).j();
                    return;
                }
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) this.f8159c;
                TranslateController translateController = (TranslateController) this.d;
                MessageObject messageObject = (MessageObject) this.f8160e;
                String str = (String) obj;
                if (this.f8158b == photoViewer.M4) {
                    photoViewer.f35677k5 = str;
                    if (translateController.isContextTranslateEnabled() && translateController.canTranslatePhoto(messageObject, photoViewer.f35677k5)) {
                        if (photoViewer.f35668j5) {
                            photoViewer.f35672k0.K(20);
                            photoViewer.f35672k0.r(19);
                            return;
                        }
                        photoViewer.f35672k0.K(19);
                        photoViewer.f35672k0.r(20);
                        return;
                    }
                    photoViewer.f35672k0.r(19);
                    photoViewer.f35672k0.r(20);
                    return;
                }
                return;
            default:
                qh.s5 s5Var = (qh.s5) this.f8159c;
                qh.a aVar = (qh.a) this.d;
                String str2 = (String) this.f8160e;
                SpannableString spannableString = (SpannableString) obj;
                if (this.f8158b == s5Var.E && s5Var.f46709x == aVar) {
                    Editable text = s5Var.f46704f.getText();
                    if (TextUtils.equals(str2, text)) {
                        for (CodeHighlighting.ColorSpan colorSpan : (CodeHighlighting.ColorSpan[]) text.getSpans(0, text.length(), CodeHighlighting.ColorSpan.class)) {
                            text.removeSpan(colorSpan);
                        }
                        CodeHighlighting.ColorSpan[] colorSpanArr = (CodeHighlighting.ColorSpan[]) spannableString.getSpans(0, spannableString.length(), CodeHighlighting.ColorSpan.class);
                        int length = text.length();
                        for (int i10 = 0; i10 < colorSpanArr.length; i10++) {
                            int spanStart = spannableString.getSpanStart(colorSpanArr[i10]);
                            int spanEnd = spannableString.getSpanEnd(colorSpanArr[i10]);
                            if (spanStart >= 0 && spanEnd <= length && spanStart < spanEnd) {
                                text.setSpan(colorSpanArr[i10], spanStart, spanEnd, 33);
                            }
                        }
                        s5Var.D = str2;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public g8(dv dvVar, int[] iArr, int i9, ArrayList arrayList) {
        this.f8157a = 2;
        this.f8159c = dvVar;
        this.d = iArr;
        this.f8158b = i9;
        this.f8160e = arrayList;
    }
}
