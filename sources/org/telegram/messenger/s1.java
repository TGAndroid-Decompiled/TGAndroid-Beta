package org.telegram.messenger;

import android.app.Activity;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fv0;
import org.telegram.ui.zp0;
public final class s1 implements Runnable {
    public final int f21434a = 3;
    public final int f21435b;
    public final Object f21436c;
    public final boolean d;
    public final Object f21437e;
    public final Object f21438f;
    public final Object h;

    public s1(Activity activity, int i9, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.f21437e = activity;
        this.f21435b = i9;
        this.f21436c = inputGroupCall;
        this.d = z10;
        this.f21438f = groupCall;
        this.h = hashSet;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.s1.run():void");
    }

    public s1(ContactsController contactsController, int i9, ArrayList arrayList, ArrayList arrayList2, a0.h hVar, boolean z10) {
        this.f21437e = contactsController;
        this.f21435b = i9;
        this.f21436c = arrayList;
        this.f21438f = arrayList2;
        this.h = hVar;
        this.d = z10;
    }

    public s1(SendMessagesHelper sendMessagesHelper, TLObject tLObject, int i9, SendMessagesHelper.DelayedMessage delayedMessage, ArrayList arrayList, boolean z10) {
        this.f21437e = sendMessagesHelper;
        this.f21438f = tLObject;
        this.f21435b = i9;
        this.h = delayedMessage;
        this.f21436c = arrayList;
        this.d = z10;
    }

    public s1(fv0 fv0Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i9, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        this.f21437e = fv0Var;
        this.f21436c = tL_messages_stickerSet;
        this.f21435b = i9;
        this.f21438f = messageObject;
        this.h = t1Var;
        this.d = z10;
    }

    public s1(zp0 zp0Var, String str, int i9, TLObject tLObject, boolean z10, TLRPC.User user) {
        this.f21437e = zp0Var;
        this.f21436c = str;
        this.f21435b = i9;
        this.f21438f = tLObject;
        this.d = z10;
        this.h = user;
    }

    public s1(qh.o3 o3Var, Uri uri, boolean z10, String str, int i9, qh.a aVar) {
        this.f21437e = o3Var;
        this.f21436c = uri;
        this.d = z10;
        this.f21438f = str;
        this.f21435b = i9;
        this.h = aVar;
    }
}
