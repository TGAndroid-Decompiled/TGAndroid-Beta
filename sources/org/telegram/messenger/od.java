package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class od implements RequestDelegate {
    public final int f19154a;
    public final MessagesController f19155b;
    public final int f19156c;
    public final int d;
    public final int e;
    public final int f19157f;
    public final int f19158g;
    public final long h;
    public final long f19159i;
    public final int f19160j;
    public final int f19161k;
    public final int f19162l;
    public final int f19163m;
    public final int f19164n;
    public final long f19165o;
    public final int f19166p;
    public final boolean f19167q;
    public final int f19168r;
    public final boolean f19169s;
    public final boolean f19170t;
    public final TLObject f19171u;

    public od(MessagesController messagesController, int i10, int i11, int i12, int i13, int i14, long j10, long j11, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.f19154a = 1;
        this.f19155b = messagesController;
        this.f19156c = i10;
        this.d = i11;
        this.e = i12;
        this.f19157f = i13;
        this.f19158g = i14;
        this.h = j10;
        this.f19159i = j11;
        this.f19160j = i15;
        this.f19161k = i16;
        this.f19162l = i17;
        this.f19163m = i18;
        this.f19164n = i19;
        this.f19165o = j12;
        this.f19166p = i20;
        this.f19167q = z10;
        this.f19168r = i21;
        this.f19169s = z11;
        this.f19170t = z12;
        this.f19171u = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19154a) {
            case 0:
                this.f19155b.lambda$loadMessagesInternal$177(this.h, this.f19156c, this.d, this.e, this.f19159i, this.f19157f, this.f19158g, this.f19160j, this.f19161k, this.f19162l, this.f19163m, this.f19164n, this.f19165o, this.f19166p, this.f19167q, this.f19168r, this.f19169s, this.f19170t, (TLRPC.TL_messages_getSavedHistory) this.f19171u, tLObject, tL_error);
                return;
            case 1:
                this.f19155b.lambda$loadMessagesInternal$179(this.f19156c, this.d, this.e, this.f19157f, this.f19158g, this.h, this.f19159i, this.f19160j, this.f19161k, this.f19162l, this.f19163m, this.f19164n, this.f19165o, this.f19166p, this.f19167q, this.f19168r, this.f19169s, this.f19170t, (TLRPC.TL_messages_getReplies) this.f19171u, tLObject, tL_error);
                return;
            default:
                this.f19155b.lambda$loadMessagesInternal$184(this.h, this.f19156c, this.d, this.e, this.f19159i, this.f19157f, this.f19158g, this.f19160j, this.f19161k, this.f19162l, this.f19163m, this.f19164n, this.f19165o, this.f19166p, this.f19167q, this.f19168r, this.f19169s, this.f19170t, (TLRPC.TL_messages_getHistory) this.f19171u, tLObject, tL_error);
                return;
        }
    }

    public od(MessagesController messagesController, long j10, int i10, int i11, int i12, long j11, int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j12, int i20, boolean z10, int i21, boolean z11, boolean z12, TLObject tLObject, int i22) {
        this.f19154a = i22;
        this.f19155b = messagesController;
        this.h = j10;
        this.f19156c = i10;
        this.d = i11;
        this.e = i12;
        this.f19159i = j11;
        this.f19157f = i13;
        this.f19158g = i14;
        this.f19160j = i15;
        this.f19161k = i16;
        this.f19162l = i17;
        this.f19163m = i18;
        this.f19164n = i19;
        this.f19165o = j12;
        this.f19166p = i20;
        this.f19167q = z10;
        this.f19168r = i21;
        this.f19169s = z11;
        this.f19170t = z12;
        this.f19171u = tLObject;
    }
}
