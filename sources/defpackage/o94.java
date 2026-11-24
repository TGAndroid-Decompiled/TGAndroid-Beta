package defpackage;

import android.os.AsyncTask;
import android.util.Pair;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class o94 implements Runnable {
    public final byte a;
    public final byte b;
    public final Object c;
    public final Object d;

    public o94(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    @Override
    public final void run() {
        int O;
        int i;
        tk5 tk5Var;
        gl5 gl5Var;
        TLRPC.Document document;
        uu9 uu9Var;
        usc uscVar;
        TLRPC.FileLocation fileLocation;
        uu9 uu9Var2;
        String str;
        usc uscVar2;
        String file;
        ArrayList arrayList;
        String str2;
        TLRPC.PhotoSize photoSize;
        int i2;
        int i3;
        byte b = this.a;
        int i4 = 7;
        byte b2 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ba4 ba4Var = (ba4) obj2;
                String str3 = (String) obj;
                l94 l94Var = (l94) ba4Var.w.get(str3);
                if (l94Var != null && l94Var.W0 != (O = ba4Var.O(b2))) {
                    l94Var.W0 = O;
                    u20 u20Var = l94Var.e1;
                    ((ArrayList) u20Var.d).remove(l94Var);
                    u20Var.a(l94Var);
                    u20Var.b(false);
                    StringBuilder p = ug8.p("update priority ", str3, " position in queue ");
                    p.append(((ArrayList) l94Var.e1.d).indexOf(l94Var));
                    p.append(" account=");
                    b00.p(ba4Var.currentAccount, p);
                    return;
                }
                return;
            case 1:
                ((cr8) ((ee3) obj2).c).f(b2, (Serializable) obj);
                return;
            case 2:
                vq3 vq3Var = (vq3) obj2;
                ((wq3) obj).n(vq3Var.a, vq3Var.b, b2);
                return;
            case 3:
                fl5 fl5Var = (fl5) obj2;
                ImageReceiver imageReceiver = (ImageReceiver) obj;
                for (int i5 = 0; i5 < 3; i5++) {
                    if (i5 == 0) {
                        i = 1;
                    } else if (i5 == 1) {
                        i = 0;
                    } else {
                        i = 3;
                    }
                    int A = imageReceiver.A(i);
                    if (A != 0 && (tk5Var = (tk5) fl5Var.k.get(A)) != null && (gl5Var = tk5Var.i) != null) {
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = gl5Var.f;
                        if (tL_fileLocationToBeDeprecated != null) {
                            str = tk5Var.g;
                            fileLocation = tL_fileLocationToBeDeprecated;
                            document = null;
                            uu9Var = null;
                            uscVar2 = null;
                        } else {
                            TLRPC.Document document2 = gl5Var.i;
                            if (document2 != null) {
                                document = document2;
                                uu9Var = null;
                            } else {
                                uu9 uu9Var3 = gl5Var.h;
                                if (uu9Var3 != null) {
                                    uu9Var = uu9Var3;
                                    document = null;
                                    uu9Var2 = null;
                                    fileLocation = uu9Var2;
                                    uscVar = uu9Var2;
                                    str = fileLocation;
                                    uscVar2 = uscVar;
                                } else {
                                    usc uscVar3 = gl5Var.v;
                                    if (uscVar3 != null) {
                                        uscVar = uscVar3;
                                        document = null;
                                        uu9Var = null;
                                        fileLocation = null;
                                        str = fileLocation;
                                        uscVar2 = uscVar;
                                    } else {
                                        document = null;
                                        uu9Var = null;
                                    }
                                }
                            }
                            uu9Var2 = uu9Var;
                            fileLocation = uu9Var2;
                            uscVar = uu9Var2;
                            str = fileLocation;
                            uscVar2 = uscVar;
                        }
                        ba4.G(tk5Var.o).h(this.b, document, uu9Var, uscVar2, fileLocation, str);
                    }
                }
                return;
            case 4:
                fl5 fl5Var2 = (fl5) obj2;
                wk5 wk5Var = (wk5) obj;
                LinkedList linkedList = fl5Var2.B;
                HashMap hashMap = fl5Var2.C;
                if (wk5Var != null) {
                    File file2 = wk5Var.b;
                    fl5Var2.E--;
                    int i6 = wk5Var.h;
                    String str4 = wk5Var.a;
                    if (b2 == 1) {
                        if (wk5Var.f) {
                            wk5 wk5Var2 = new wk5(fl5Var2, wk5Var.a, file2, wk5Var.c, wk5Var.h);
                            fl5Var2 = fl5Var2;
                            hb5 hb5Var = new hb5(fl5Var2, wk5Var2, (byte) 7);
                            fl5Var2.D.put(str4, hb5Var);
                            gl.e3(hb5Var, 1000L);
                        } else {
                            hashMap.remove(str4);
                            kk7.f(i6).k(136, str4, 0);
                        }
                    } else if (b2 == 2) {
                        hashMap.remove(str4);
                        File file3 = new File(ba4.z(4), Utilities.a(str4) + "." + wk5Var.c);
                        if (file2.renameTo(file3)) {
                            file = file3.toString();
                        } else {
                            file = file2.toString();
                        }
                        kk7.f(i6).k(135, str4, file);
                    }
                }
                while (fl5Var2.E < 2 && !linkedList.isEmpty()) {
                    ((wk5) linkedList.poll()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                    fl5Var2.E++;
                }
                return;
            case 5:
                eb6 eb6Var = (eb6) obj2;
                db6 db6Var = (db6) obj;
                try {
                    if (b2 == 2) {
                        eb6Var.getMessagesStorage().b.executeFast("DELETE FROM sharing_locations WHERE 1").stepThis().dispose();
                    } else if (b2 == 1) {
                        if (db6Var != null) {
                            eb6Var.getMessagesStorage().b.executeFast("DELETE FROM sharing_locations WHERE uid = " + db6Var.a).stepThis().dispose();
                        } else {
                            return;
                        }
                    } else if (db6Var != null) {
                        SQLitePreparedStatement executeFast = eb6Var.getMessagesStorage().b.executeFast("REPLACE INTO sharing_locations VALUES(?, ?, ?, ?, ?, ?)");
                        executeFast.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(db6Var.h.k.getObjectSize());
                        db6Var.h.k.serializeToStream(nativeByteBuffer);
                        executeFast.bindLong(1, db6Var.a);
                        executeFast.bindInteger(2, db6Var.b);
                        executeFast.bindInteger(3, db6Var.c);
                        executeFast.bindInteger(4, db6Var.d);
                        executeFast.bindByteBuffer(5, nativeByteBuffer);
                        executeFast.bindInteger(6, db6Var.f);
                        executeFast.step();
                        executeFast.dispose();
                        nativeByteBuffer.reuse();
                    } else {
                        return;
                    }
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 6:
                hq6 hq6Var = (hq6) obj2;
                TL_account.TL_emojiStatuses tL_emojiStatuses = (TL_account.TL_emojiStatuses) obj;
                try {
                    hq6Var.getMessagesStorage().b.executeFast("DELETE FROM emoji_statuses WHERE type = " + ((int) b2)).stepThis().dispose();
                    SQLitePreparedStatement executeFast2 = hq6Var.getMessagesStorage().b.executeFast("INSERT INTO emoji_statuses VALUES(?, ?)");
                    executeFast2.requery();
                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(tL_emojiStatuses.getObjectSize());
                    tL_emojiStatuses.serializeToStream(nativeByteBuffer2);
                    executeFast2.bindByteBuffer(1, nativeByteBuffer2);
                    executeFast2.bindInteger(2, b2);
                    executeFast2.step();
                    nativeByteBuffer2.reuse();
                    executeFast2.dispose();
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
                hq6Var.I0[b2] = false;
                return;
            case 7:
                hq6 hq6Var2 = (hq6) obj2;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) obj;
                hq6Var2.U.l(stickerSet.id);
                hq6Var2.c1(this.b, false, true, false, new vo6(hq6Var2, stickerSet, (byte) 1));
                return;
            case 8:
                hq6 hq6Var3 = (hq6) obj2;
                TLRPC.Document document3 = (TLRPC.Document) obj;
                if (b2 == 0) {
                    i4 = 3;
                } else if (b2 == 1) {
                    i4 = 4;
                } else if (b2 != 5) {
                    i4 = 5;
                }
                try {
                    hq6Var3.getMessagesStorage().b.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document3.id + "' AND type = " + i4).stepThis().dispose();
                    return;
                } catch (Exception e3) {
                    fa4.g(e3, true);
                    return;
                }
            case 9:
                Pair pair = (Pair) obj;
                ((by6) obj2).b.i.n(((Integer) pair.first).intValue(), (rx6) pair.second, b2);
                return;
            case 10:
                na7 na7Var = (na7) obj2;
                vn2 vn2Var = (vn2) obj;
                if (vn2Var != null) {
                    vn2Var.a(Integer.valueOf(b2), null);
                }
                na7Var.getNotificationCenter().k(2, 8192);
                return;
            case 11:
                ad7 ad7Var = (ad7) obj2;
                ad7Var.b1((TLRPC.messages_Dialogs) obj, b2);
                try {
                    ad7Var.a.c(new vb7(ad7Var, (byte) 21));
                    return;
                } catch (Exception e4) {
                    ad7Var.n(e4, true);
                    return;
                }
            case 12:
                ArrayList arrayList2 = (ArrayList) obj;
                up3 downloadController = ((ad7) obj2).getDownloadController();
                HashMap hashMap2 = downloadController.f;
                if (!arrayList2.isEmpty()) {
                    if (b2 == 1) {
                        arrayList = downloadController.b;
                    } else if (b2 == 2) {
                        arrayList = downloadController.c;
                    } else if (b2 == 4) {
                        arrayList = downloadController.e;
                    } else {
                        arrayList = downloadController.d;
                    }
                    for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                        vp3 vp3Var = (vp3) arrayList2.get(i7);
                        TLObject tLObject = vp3Var.a;
                        if (tLObject instanceof TLRPC.Document) {
                            str2 = ba4.r(null, (TLRPC.Document) tLObject);
                            photoSize = null;
                        } else if (tLObject instanceof TLRPC.Photo) {
                            TLRPC.PhotoSize w = ba4.w(((TLRPC.Photo) tLObject).sizes, gl.Y0(false), false, null, false);
                            photoSize = w;
                            str2 = ba4.r(null, w);
                        } else {
                            str2 = null;
                            photoSize = null;
                        }
                        if (str2 != null && !hashMap2.containsKey(str2)) {
                            TLObject tLObject2 = vp3Var.a;
                            if (photoSize != null) {
                                TLRPC.Photo photo = (TLRPC.Photo) tLObject2;
                                if (vp3Var.d) {
                                    i3 = 2;
                                } else if (vp3Var.e) {
                                    i3 = 1;
                                } else {
                                    i3 = 0;
                                }
                                downloadController.getFileLoader().V(gl5.i(photoSize, photo), vp3Var.f, null, 0, i3);
                            } else if (tLObject2 instanceof TLRPC.Document) {
                                TLRPC.Document document4 = (TLRPC.Document) tLObject2;
                                ba4 fileLoader = downloadController.getFileLoader();
                                String str5 = vp3Var.f;
                                if (vp3Var.d) {
                                    i2 = 2;
                                } else {
                                    i2 = 0;
                                }
                                fileLoader.X(document4, str5, 0, i2);
                            }
                            arrayList.add(vp3Var);
                            hashMap2.put(str2, vp3Var);
                            downloadController.h.put(new Pair(Long.valueOf(vp3Var.c), Integer.valueOf(vp3Var.b)), vp3Var);
                        }
                    }
                    return;
                }
                return;
            case 13:
                ((vx7) obj2).w1((uu9) obj, b2);
                return;
            default:
                lk0 lk0Var = (lk0) obj;
                wi9 wi9Var = ((qi9) obj2).a;
                if (wi9Var.E != null) {
                    wi9.c(lk0Var.b, "");
                    ((ie9) wi9Var.E).c(lk0Var, b2);
                    return;
                }
                return;
        }
    }

    public o94(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
