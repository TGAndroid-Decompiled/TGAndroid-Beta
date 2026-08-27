package hh;

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
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.pc;
import org.telegram.ui.PhotoViewer;

public final class f8 implements Utilities.Callback {

    public final int f9280a;

    public final int f9281b;

    public final Object f9282c;
    public final Object d;

    public final Object f9283e;

    public f8(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f9280a = i11;
        this.f9282c = obj;
        this.f9281b = i10;
        this.d = obj2;
        this.f9283e = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f9280a) {
            case 0:
                oc ocVar = (oc) this.f9282c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f9283e;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ocVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) pc.b(LocaleController.getString(R.string.StarGiftReasonUpgradeView), new ag.k0(this.f9281b, context, c6Var, savedStarGift), c6Var, null));
                    ocVar.setText(spannableStringBuilder);
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f9282c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                long j10 = ((TLRPC.Chat) this.f9283e).f22380id;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean zIsChannel = ChatObject.isChannel(chat);
                int i10 = this.f9281b;
                if (zIsChannel) {
                    long j11 = chat.f22380id;
                    MessagesController.getInstance(i10).linkCommunity(-j11, j10, zBooleanValue, new gh.m(n2Var, j11, 1));
                } else {
                    org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(n2Var.getContext(), 3, null);
                    b2Var.q(250L);
                    MessagesController.getInstance(i10).convertToMegaGroup(n2Var.getParentActivity(), chat.f22380id, n2Var, new oh.l0(b2Var, n2Var, i10, j10, zBooleanValue));
                }
                break;
            case 2:
                cv cvVar = (cv) this.f9282c;
                int[] iArr = (int[]) this.d;
                ArrayList arrayList = (ArrayList) this.f9283e;
                org.telegram.ui.ActionBar.n2 n2Var2 = cvVar.f27548c;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == this.f9281b && iArr[1] > 0) {
                    cvVar.dismiss();
                    ec.g(n2Var2, new kw0(n2Var2.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, n2Var2.getResourceProvider()), 1500).j();
                    break;
                }
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) this.f9282c;
                TranslateController translateController = (TranslateController) this.d;
                MessageObject messageObject = (MessageObject) this.f9283e;
                String str = (String) obj;
                if (this.f9281b == photoViewer.M4) {
                    photoViewer.f35680k5 = str;
                    if (!translateController.isContextTranslateEnabled() || !translateController.canTranslatePhoto(messageObject, photoViewer.f35680k5)) {
                        photoViewer.f35675k0.r(19);
                        photoViewer.f35675k0.r(20);
                    } else if (photoViewer.f35671j5) {
                        photoViewer.f35675k0.K(20);
                        photoViewer.f35675k0.r(19);
                    } else {
                        photoViewer.f35675k0.K(19);
                        photoViewer.f35675k0.r(20);
                    }
                    break;
                }
                break;
            default:
                rh.t5 t5Var = (rh.t5) this.f9282c;
                rh.a aVar = (rh.a) this.d;
                String str2 = (String) this.f9283e;
                SpannableString spannableString = (SpannableString) obj;
                if (this.f9281b == t5Var.E && t5Var.f47487x == aVar) {
                    Editable text = t5Var.f47482f.getText();
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
                        break;
                    }
                }
                break;
        }
    }

    public f8(cv cvVar, int[] iArr, int i10, ArrayList arrayList) {
        this.f9280a = 2;
        this.f9282c = cvVar;
        this.d = iArr;
        this.f9281b = i10;
        this.f9283e = arrayList;
    }
}
