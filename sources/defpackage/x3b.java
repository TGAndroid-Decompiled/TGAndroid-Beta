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
public final class x3b implements Runnable {
    public final byte a;
    public final z3b b;
    public final cf7 c;

    public x3b(z3b z3bVar, cf7 cf7Var, byte b) {
        this.a = b;
        this.b = z3bVar;
        this.c = cf7Var;
    }

    @Override
    public final void run() {
        long j;
        int i;
        TLRPC.Peer peer;
        byte b = this.a;
        boolean z = true;
        cf7 cf7Var = this.c;
        switch (b) {
            case 0:
                z3b z3bVar = this.b;
                long j2 = z3bVar.d;
                ArrayList arrayList = new ArrayList();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                SQLiteCursor sQLiteCursor = null;
                try {
                    sQLiteCursor = cf7Var.w(z3bVar.f, z3bVar.e, j2);
                    while (sQLiteCursor.next()) {
                        NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            TL_stories.StoryItem TLdeserialize = TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(z), z);
                            TLdeserialize.dialogId = j2;
                            TLdeserialize.messageId = TLdeserialize.id;
                            k47 k47Var = new k47(z3bVar.c, TLdeserialize);
                            ArrayList<TLRPC.PrivacyRule> arrayList5 = TLdeserialize.privacy;
                            j = j2;
                            int size = arrayList5.size();
                            int i2 = 0;
                            while (i2 < size) {
                                TLRPC.PrivacyRule privacyRule = arrayList5.get(i2);
                                int i3 = i2 + 1;
                                int i4 = size;
                                TLRPC.PrivacyRule privacyRule2 = privacyRule;
                                if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowUsers) {
                                    hashSet2.addAll(((TLRPC.TL_privacyValueDisallowUsers) privacyRule2).users);
                                } else if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowUsers) {
                                    hashSet2.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule2).users);
                                }
                                i2 = i3;
                                size = i4;
                            }
                            TL_stories.StoryFwdHeader storyFwdHeader = TLdeserialize.fwd_from;
                            if (storyFwdHeader != null && (peer = storyFwdHeader.from) != null) {
                                long n = pg3.n(peer);
                                if (n >= 0) {
                                    hashSet2.add(Long.valueOf(n));
                                } else {
                                    hashSet3.add(Long.valueOf(-n));
                                }
                            }
                            int i5 = 0;
                            while (i5 < TLdeserialize.media_areas.size()) {
                                if (TLdeserialize.media_areas.get(i5) instanceof TL_stories.TL_mediaAreaChannelPost) {
                                    i = i5;
                                    hashSet3.add(Long.valueOf(((TL_stories.TL_mediaAreaChannelPost) TLdeserialize.media_areas.get(i5)).channel_id));
                                } else {
                                    i = i5;
                                }
                                i5 = i + 1;
                            }
                            TLRPC.Peer peer2 = TLdeserialize.from_id;
                            if (peer2 != null) {
                                long n2 = pg3.n(peer2);
                                if (n2 >= 0) {
                                    hashSet2.add(Long.valueOf(n2));
                                } else {
                                    hashSet3.add(Long.valueOf(-n2));
                                }
                            }
                            k47Var.r0(false);
                            arrayList2.add(k47Var);
                            byteBufferValue.reuse();
                            if (sQLiteCursor.intValue(1) == 1) {
                                hashSet.add(Integer.valueOf(TLdeserialize.id));
                            }
                            int intValue = sQLiteCursor.intValue(2);
                            if (intValue > 0) {
                                arrayList.add(Utilities.j(intValue, arrayList.size() - 1, 0), Integer.valueOf(TLdeserialize.id));
                            }
                        } else {
                            j = j2;
                        }
                        j2 = j;
                        z = true;
                    }
                    sQLiteCursor.dispose();
                    if (!hashSet2.isEmpty()) {
                        cf7Var.l0(arrayList3, hashSet2);
                    }
                    if (!hashSet3.isEmpty()) {
                        cf7Var.P(TextUtils.join(",", hashSet3), arrayList4);
                    }
                } catch (Throwable th) {
                    try {
                        cf7Var.n(th, true);
                        break;
                    } finally {
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                    }
                }
                gm.c3(new fqa(z3bVar, arrayList2, arrayList, arrayList3, arrayList4, hashSet, (byte) 8));
                return;
            default:
                z3b z3bVar2 = this.b;
                try {
                    SQLiteDatabase sQLiteDatabase = cf7Var.b;
                    Locale locale = Locale.US;
                    long j3 = z3bVar2.d;
                    byte b2 = z3bVar2.e;
                    sQLiteDatabase.executeFast("DELETE FROM profile_stories WHERE dialog_id = " + j3 + " AND type = " + ((int) b2)).stepThis().dispose();
                } catch (Throwable th2) {
                    cf7Var.n(th2, true);
                }
                gm.c3(new w3b(z3bVar2, (byte) 3));
                return;
        }
    }
}
