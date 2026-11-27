package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class t5b implements Runnable {
    public final byte a;
    public final v5b b;
    public final kf7 c;

    public t5b(v5b v5bVar, kf7 kf7Var, byte b) {
        this.a = b;
        this.b = v5bVar;
        this.c = kf7Var;
    }

    @Override
    public final void run() {
        v5b v5bVar;
        long j;
        long j2;
        TLRPC.Peer peer;
        byte b = this.a;
        boolean z = true;
        kf7 kf7Var = this.c;
        switch (b) {
            case 0:
                v5b v5bVar2 = this.b;
                long j3 = v5bVar2.d;
                ArrayList arrayList = new ArrayList();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                SQLiteCursor sQLiteCursor = null;
                try {
                    sQLiteCursor = kf7Var.y(v5bVar2.f, v5bVar2.e, j3);
                    while (sQLiteCursor.next()) {
                        NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            TL_stories.StoryItem TLdeserialize = TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(z), z);
                            TLdeserialize.dialogId = j3;
                            TLdeserialize.messageId = TLdeserialize.id;
                            r47 r47Var = new r47(v5bVar2.c, TLdeserialize);
                            ArrayList<TLRPC.PrivacyRule> arrayList5 = TLdeserialize.privacy;
                            v5bVar = v5bVar2;
                            try {
                                int size = arrayList5.size();
                                j = j3;
                                int i = 0;
                                while (i < size) {
                                    TLRPC.PrivacyRule privacyRule = arrayList5.get(i);
                                    i++;
                                    TLRPC.PrivacyRule privacyRule2 = privacyRule;
                                    int i2 = size;
                                    if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowUsers) {
                                        hashSet2.addAll(((TLRPC.TL_privacyValueDisallowUsers) privacyRule2).users);
                                    } else if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowUsers) {
                                        hashSet2.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule2).users);
                                    }
                                    size = i2;
                                }
                                TL_stories.StoryFwdHeader storyFwdHeader = TLdeserialize.fwd_from;
                                if (storyFwdHeader != null && (peer = storyFwdHeader.from) != null) {
                                    j2 = 0;
                                    long n = wf3.n(peer);
                                    if (n >= 0) {
                                        hashSet2.add(Long.valueOf(n));
                                    } else {
                                        hashSet3.add(Long.valueOf(-n));
                                    }
                                } else {
                                    j2 = 0;
                                }
                                for (int i3 = 0; i3 < TLdeserialize.media_areas.size(); i3++) {
                                    if (TLdeserialize.media_areas.get(i3) instanceof TL_stories.TL_mediaAreaChannelPost) {
                                        hashSet3.add(Long.valueOf(((TL_stories.TL_mediaAreaChannelPost) TLdeserialize.media_areas.get(i3)).channel_id));
                                    }
                                }
                                TLRPC.Peer peer2 = TLdeserialize.from_id;
                                if (peer2 != null) {
                                    long n2 = wf3.n(peer2);
                                    if (n2 >= j2) {
                                        hashSet2.add(Long.valueOf(n2));
                                    } else {
                                        hashSet3.add(Long.valueOf(-n2));
                                    }
                                }
                                r47Var.r0(false);
                                arrayList2.add(r47Var);
                                byteBufferValue.reuse();
                                if (sQLiteCursor.intValue(1) == 1) {
                                    hashSet.add(Integer.valueOf(TLdeserialize.id));
                                }
                                int intValue = sQLiteCursor.intValue(2);
                                if (intValue > 0) {
                                    arrayList.add(Utilities.j(intValue, arrayList.size() - 1, 0), Integer.valueOf(TLdeserialize.id));
                                }
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    kf7Var.p(th, true);
                                    break;
                                } finally {
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                }
                            }
                        } else {
                            v5bVar = v5bVar2;
                            j = j3;
                        }
                        v5bVar2 = v5bVar;
                        j3 = j;
                        z = true;
                    }
                    v5bVar = v5bVar2;
                    sQLiteCursor.dispose();
                    if (!hashSet2.isEmpty()) {
                        kf7Var.n0(arrayList3, hashSet2);
                    }
                    if (!hashSet3.isEmpty()) {
                        kf7Var.R(TextUtils.join(",", hashSet3), arrayList4);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    v5bVar = v5bVar2;
                }
                hl.c3(new esa(v5bVar, arrayList2, arrayList, arrayList3, arrayList4, hashSet, (byte) 8));
                return;
            default:
                v5b v5bVar3 = this.b;
                try {
                    SQLiteDatabase sQLiteDatabase = kf7Var.b;
                    Locale locale = Locale.US;
                    long j4 = v5bVar3.d;
                    byte b2 = v5bVar3.e;
                    sQLiteDatabase.executeFast("DELETE FROM profile_stories WHERE dialog_id = " + j4 + " AND type = " + ((int) b2)).stepThis().dispose();
                } catch (Throwable th3) {
                    kf7Var.p(th3, true);
                }
                hl.c3(new s5b(v5bVar3, (byte) 2));
                return;
        }
    }
}
