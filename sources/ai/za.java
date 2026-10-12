package ai;

import android.content.Context;
import android.view.KeyEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wh0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gj;
import org.telegram.ui.q70;
import org.telegram.ui.ts;
import org.telegram.ui.u60;
import org.telegram.ui.yq;
public final class za implements RequestDelegate {
    public final int f2021a;
    public final int f2022b;
    public final Object f2023c;
    public final Object d;
    public final Object f2024e;
    public final Object f2025f;

    public za(int i10, Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f2021a = i11;
        this.f2022b = i10;
        this.d = obj;
        this.f2024e = obj2;
        this.f2023c = obj3;
        this.f2025f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f2021a;
        Object obj = this.f2024e;
        Object obj2 = this.f2025f;
        Object obj3 = this.f2023c;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new db((eb) obj4, tLObject, this.f2024e, (ArrayList) obj3, (boolean[]) obj2, this.f2022b));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new gg.d1((gg.e1) obj4, this.f2022b, (ArrayList) obj3, (a0.i) obj, tL_error, tLObject, (MessagesController) obj2, 0));
                return;
            case 2:
                ((ChatObject.Call) obj4).lambda$loadUnknownParticipants$6(this.f2022b, (ChatObject.Call.OnParticipantsLoad) obj, (ArrayList) obj3, (HashSet) obj2, tLObject, tL_error);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new db(this.f2022b, 5, (org.telegram.ui.ActionBar.a2) obj4, (Context) obj, (org.telegram.ui.ActionBar.c6) obj3, (u60) obj2, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new gg.d1(tL_error, tLObject, (ArrayList) obj3, this.f2022b, (AtomicInteger) obj4, (ArrayList) obj, (yq) obj2));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new db((wh0) obj4, (Integer[]) obj, this.f2022b, tLObject, (ArrayList) obj3, (TLRPC.PollAnswerVoters) obj2));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new gg.d1((org.telegram.ui.ActionBar.a2) obj4, tLObject, this.f2022b, (TLRPC.Document) obj3, tL_error, this.f2024e, (TLRPC.TL_stickers_addStickerToSet) obj2));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new db((ts) obj4, (TLRPC.FileLocation) obj, (TLRPC.InputFile) obj3, tLObject, (TLRPC.FileLocation) obj2, this.f2022b));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new gg.d1((org.telegram.ui.ActionBar.a2) obj4, (of.e) obj, tLObject, this.f2022b, (Context) obj3, (TLRPC.TL_inputGroupCallSlug) obj2, tL_error));
                return;
            case 9:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new gg.d1((LaunchActivity) obj4, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj, (q70) obj3, this.f2022b, (String) obj2));
                return;
            case 10:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new gg.d1((LaunchActivity) obj4, tL_error, tLObject, this.f2022b, (org.telegram.ui.ActionBar.a2) obj, (q70) obj3, (String) obj2));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new gg.d1((org.telegram.ui.web.b1) obj4, (String) obj, tLObject, tL_error, this.f2022b, (org.telegram.ui.web.y0) obj3, (ea) obj2));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new db(this.f2022b, 13, (TLRPC.PhotoSize) obj4, (TLRPC.PhotoSize) obj, (gj) obj3, (org.telegram.ui.ActionBar.b5) obj2, tLObject));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new qg.f2((ci.d) obj4, (org.telegram.ui.ActionBar.e3[]) obj, this.f2022b, (TLObject) obj3, (String) obj2, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new db((ci.d) obj4, tLObject, (org.telegram.ui.ActionBar.e3[]) obj, (org.telegram.ui.ActionBar.c6) obj3, this.f2022b, (TLRPC.TL_messages_checkChatInvite) obj2, 14));
                return;
        }
    }

    public za(KeyEvent.Callback callback, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f2021a = i11;
        this.d = callback;
        this.f2024e = obj;
        this.f2022b = i10;
        this.f2023c = obj2;
        this.f2025f = obj3;
    }

    public za(KeyEvent.Callback callback, Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f2021a = i11;
        this.d = callback;
        this.f2024e = obj;
        this.f2023c = obj2;
        this.f2022b = i10;
        this.f2025f = obj3;
    }

    public za(Object obj, int i10, Object obj2, Object obj3, Serializable serializable, int i11) {
        this.f2021a = i11;
        this.d = obj;
        this.f2022b = i10;
        this.f2024e = obj2;
        this.f2023c = obj3;
        this.f2025f = serializable;
    }

    public za(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f2021a = i11;
        this.d = obj;
        this.f2022b = i10;
        this.f2023c = obj2;
        this.f2024e = obj3;
        this.f2025f = obj4;
    }

    public za(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f2021a = i11;
        this.d = obj;
        this.f2024e = obj2;
        this.f2023c = obj3;
        this.f2025f = obj4;
        this.f2022b = i10;
    }

    public za(ArrayList arrayList, int i10, AtomicInteger atomicInteger, ArrayList arrayList2, yq yqVar) {
        this.f2021a = 4;
        this.f2023c = arrayList;
        this.f2022b = i10;
        this.d = atomicInteger;
        this.f2024e = arrayList2;
        this.f2025f = yqVar;
    }
}
