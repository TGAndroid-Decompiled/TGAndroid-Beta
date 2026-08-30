package org.telegram.messenger;

import android.app.Activity;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.yv0;
import org.telegram.ui.fq0;
public final class s1 implements Runnable {
    public final int f18351a = 3;
    public final int f18352b;
    public final Object f18353c;
    public final boolean d;
    public final Object e;
    public final Object f18354f;
    public final Object h;

    public s1(Activity activity, int i10, TLRPC.InputGroupCall inputGroupCall, boolean z4, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.e = activity;
        this.f18352b = i10;
        this.f18353c = inputGroupCall;
        this.d = z4;
        this.f18354f = groupCall;
        this.h = hashSet;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.s1.run():void");
    }

    public s1(ContactsController contactsController, int i10, ArrayList arrayList, ArrayList arrayList2, a0.h hVar, boolean z4) {
        this.e = contactsController;
        this.f18352b = i10;
        this.f18353c = arrayList;
        this.f18354f = arrayList2;
        this.h = hVar;
        this.d = z4;
    }

    public s1(SendMessagesHelper sendMessagesHelper, TLObject tLObject, int i10, SendMessagesHelper.DelayedMessage delayedMessage, ArrayList arrayList, boolean z4) {
        this.e = sendMessagesHelper;
        this.f18354f = tLObject;
        this.f18352b = i10;
        this.h = delayedMessage;
        this.f18353c = arrayList;
        this.d = z4;
    }

    public s1(yv0 yv0Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var, boolean z4) {
        this.e = yv0Var;
        this.f18353c = tL_messages_stickerSet;
        this.f18352b = i10;
        this.f18354f = messageObject;
        this.h = t1Var;
        this.d = z4;
    }

    public s1(fq0 fq0Var, String str, int i10, TLObject tLObject, boolean z4, TLRPC.User user) {
        this.e = fq0Var;
        this.f18353c = str;
        this.f18352b = i10;
        this.f18354f = tLObject;
        this.d = z4;
        this.h = user;
    }

    public s1(vh.r3 r3Var, Uri uri, boolean z4, String str, int i10, vh.a aVar) {
        this.e = r3Var;
        this.f18353c = uri;
        this.d = z4;
        this.f18354f = str;
        this.f18352b = i10;
        this.h = aVar;
    }
}
