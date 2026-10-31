package m4;

import ag.f3;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fs;
import org.telegram.messenger.hs;
import org.telegram.messenger.kc;
import org.telegram.messenger.mc;
import org.telegram.messenger.md;
import org.telegram.messenger.o5;
import org.telegram.messenger.oz;
import org.telegram.messenger.qz;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.vp;
import org.telegram.messenger.zr;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.o21;
import org.telegram.ui.Components.pe;
import org.telegram.ui.Components.q4;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ay;
import org.telegram.ui.bb1;
import org.telegram.ui.mx;
import org.telegram.ui.q50;
import org.telegram.ui.tb0;
import org.telegram.ui.un;
import org.telegram.ui.ya1;
import vh.j6;
import vh.q8;
import vh.r6;
public final class x0 implements h1, mc, q4, tb0, zr, g2.g, org.telegram.ui.ActionBar.u1, q50, s5.e, RequestDelegateTimestamp, fs {
    public final int f12989a;
    public final long f12990b;
    public final Object f12991c;

    public x0(long j10, l5.i iVar) {
        this.f12989a = 11;
        this.f12990b = j10;
        this.f12991c = iVar;
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        boolean t12;
        bi biVar = (bi) this.f12991c;
        uh uhVar = biVar.f24721s2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar.a2;
        long j10 = this.f12990b;
        if (uhVar != chatAttachAlertPhotoLayout && uhVar != biVar.f24679h2) {
            if (!uhVar.J(z10, i10, i11, j10, biVar.e1())) {
                biVar.f24743x4 = true;
                biVar.dismiss();
            }
            t12 = false;
        } else {
            t12 = biVar.t1(z10, i10, i11, j10, biVar.e1());
        }
        pe peVar = biVar.Y1;
        if (peVar != null) {
            peVar.g(!t12);
            biVar.Y1 = null;
        }
    }

    @Override
    public void a(String str) {
        r6 r6Var = (r6) this.f12991c;
        vp.r1(r6Var.W.f21583a).O1().r(this.f12990b, str, new j6(r6Var, 2));
    }

    @Override
    public Object apply(Object obj) {
        l5.i iVar = (l5.i) this.f12991c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f12990b));
        String str = iVar.f11664a;
        i5.d dVar = iVar.f11666c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(v5.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f11664a);
            contentValues.put("priority", Integer.valueOf(v5.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override
    public g2.h createDataSource() {
        return new q61(((u61) this.f12991c).h.createDataSource(), this.f12990b);
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        int i12 = this.f12989a;
        Object obj = this.f12991c;
        switch (i12) {
            case 3:
                float[] fArr = FragmentContextView.W0;
                qz.C(((md) obj).h.I1).r0(oz.d(messageMedia, this.f12990b, null, null, null, null, true, 0));
                return;
            default:
                Pattern pattern = LaunchActivity.D1;
                qz.C(((int[]) obj)[0]).r0(oz.d(messageMedia, this.f12990b, null, null, null, null, true, 0));
                return;
        }
    }

    @Override
    public Object f(f0 f0Var, w wVar, int i10) {
        return f0Var.q(wVar, e9.n0.y((b2.p0) this.f12991c), 0, this.f12990b);
    }

    @Override
    public void g(int i10, ArrayList arrayList) {
        bb1 bb1Var = (bb1) this.f12991c;
        k2 k2Var = bb1Var.f36164b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i11 = 0;
        while (i11 < size) {
            vp messagesController = k2Var.getMessagesController();
            f3 f3Var = new f3(13);
            long j10 = this.f12990b;
            messagesController.m(j10, (TLRPC.User) arrayList.get(i11), i10, null, k2Var, false, f3Var, null, new ya1(bb1Var, tL_messages_invitedUsers, iArr, size, arrayList, j10));
            i11++;
            size = size;
            iArr = iArr;
            tL_messages_invitedUsers = tL_messages_invitedUsers;
        }
    }

    @Override
    public void h(x1 x1Var, int i10) {
        switch (this.f12989a) {
            case 6:
                zm0 zm0Var = ((ay) this.f12991c).C0.f26451d0;
                a0.h hVar = zm0Var.f55711x0;
                long j10 = this.f12990b;
                zf.y yVar = (zf.y) hVar.f(j10);
                if (yVar != null) {
                    zm0Var.f55711x0.l(j10);
                    zm0Var.f55705t0.remove(yVar);
                    zm0Var.f55707v0.remove(yVar);
                    zm0Var.f55706u0.remove(yVar);
                    zm0Var.f();
                    hs.a0(zm0Var.f55704s0).f15938a.c(new q8(zm0Var, j10, 3));
                    return;
                }
                return;
            default:
                ((mx) this.f12991c).f39787a.getMediaDataController().N1(this.f12990b);
                return;
        }
    }

    @Override
    public void i(boolean z10) {
        un unVar = ((o21) this.f12991c).f28963y;
        if (c3.i0.t(unVar)) {
            unVar.Ga(this.f12990b, false);
        }
    }

    @Override
    public void o(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ng.d dVar = (ng.d) this.f12991c;
        kc p5 = imageReceiver.p();
        if (z10 && p5 != null) {
            Bitmap bitmap = p5.f16564c;
            if (bitmap == null) {
                Drawable drawable = p5.d;
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                }
            }
            dVar.onComplete(new Pair(Long.valueOf(this.f12990b), bitmap));
        }
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j10) {
        th.s0 s0Var = (th.s0) this.f12991c;
        long j11 = 0;
        if (tL_error == null) {
            if (s0Var.E != null && !s0Var.f49427x) {
                TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
                int i10 = 0;
                if (!groupcallstreamchannels.channels.isEmpty()) {
                    j11 = groupcallstreamchannels.channels.get(0).last_timestamp_ms;
                }
                if (groupcallstreamchannels.channels.isEmpty()) {
                    org.telegram.messenger.i0.g3(new th.n0(s0Var, 5));
                }
                if (s0Var.G == null && !groupcallstreamchannels.channels.isEmpty()) {
                    TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                    s0Var.G = tL_groupCallParticipant;
                    tL_groupCallParticipant.peer = vp.r1(s0Var.e).y1(s0Var.f49420b);
                    s0Var.G.video = new TLRPC.TL_groupCallParticipantVideo();
                    TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                    tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
                    ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList = groupcallstreamchannels.channels;
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_phone.TL_groupCallStreamChannel tL_groupCallStreamChannel = arrayList.get(i10);
                        i10++;
                        tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(tL_groupCallStreamChannel.channel));
                    }
                    s0Var.G.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
                    TLRPC.GroupCallParticipant groupCallParticipant = s0Var.G;
                    TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                    tL_groupCallParticipantVideo.endpoint = "unified";
                    groupCallParticipant.videoEndpoint = "unified";
                    NativeInstance nativeInstance = s0Var.E;
                    NativeInstance.SsrcGroup[] d = th.s0.d(tL_groupCallParticipantVideo);
                    s0Var.r(d);
                    nativeInstance.addIncomingVideoOutput(2, "unified", d, s0Var.H, o5.o(s0Var.G.peer));
                }
            } else {
                return;
            }
        }
        NativeInstance nativeInstance2 = s0Var.E;
        if (nativeInstance2 != null) {
            nativeInstance2.onRequestTimeComplete(this.f12990b, j11);
        }
    }

    public x0(Object obj, long j10, int i10) {
        this.f12989a = i10;
        this.f12991c = obj;
        this.f12990b = j10;
    }

    @Override
    public void e(TLRPC.User user) {
    }

    @Override
    public void j(ImageReceiver imageReceiver) {
    }

    @Override
    public void q(int i10, Drawable drawable) {
    }
}
