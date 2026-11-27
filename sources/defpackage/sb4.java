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
public final class sb4 implements Runnable {
    public final byte a;
    public final byte b;
    public final Object c;
    public final Object d;

    public sb4(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    @Override
    public final void run() {
        int O;
        int i;
        wm5 wm5Var;
        jn5 jn5Var;
        TLRPC.Document document;
        oy9 oy9Var;
        jxc jxcVar;
        TLRPC.FileLocation fileLocation;
        String str;
        String file;
        ArrayList arrayList;
        String str2;
        TLRPC.PhotoSize photoSize;
        int i2;
        int i3;
        byte b = this.a;
        int i4 = 5;
        byte b2 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                xb4 xb4Var = (xb4) obj2;
                String str3 = (String) obj;
                hb4 hb4Var = (hb4) xb4Var.w.get(str3);
                if (hb4Var != null && hb4Var.W0 != (O = xb4Var.O(b2))) {
                    hb4Var.W0 = O;
                    zb4 zb4Var = hb4Var.e1;
                    ((ArrayList) zb4Var.d).remove(hb4Var);
                    zb4Var.a(hb4Var);
                    zb4Var.b(false);
                    StringBuilder p = ik8.p("update priority ", str3, " position in queue ");
                    p.append(((ArrayList) hb4Var.e1.d).indexOf(hb4Var));
                    p.append(" account=");
                    c00.q(xb4Var.currentAccount, p);
                    return;
                }
                return;
            case 1:
                ((mu8) ((ye3) obj2).c).f(b2, (Serializable) obj);
                return;
            case 2:
                mr3 mr3Var = (mr3) obj2;
                ((nr3) obj).n(mr3Var.a, mr3Var.b, b2);
                return;
            case 3:
                in5 in5Var = (in5) obj2;
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
                    if (A != 0 && (wm5Var = (wm5) in5Var.k.get(A)) != null && (jn5Var = wm5Var.i) != null) {
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = jn5Var.f;
                        if (tL_fileLocationToBeDeprecated != null) {
                            str = wm5Var.g;
                            document = null;
                            oy9Var = null;
                            jxcVar = null;
                            fileLocation = tL_fileLocationToBeDeprecated;
                        } else {
                            TLRPC.Document document2 = jn5Var.i;
                            if (document2 != null) {
                                oy9Var = null;
                                jxcVar = null;
                                fileLocation = null;
                                str = 0;
                                document = document2;
                            } else {
                                oy9 oy9Var2 = jn5Var.h;
                                if (oy9Var2 != null) {
                                    document = null;
                                    jxcVar = null;
                                    fileLocation = null;
                                    str = 0;
                                    oy9Var = oy9Var2;
                                } else {
                                    jxc jxcVar2 = jn5Var.v;
                                    if (jxcVar2 != null) {
                                        jxcVar = jxcVar2;
                                        document = null;
                                        oy9Var = null;
                                        fileLocation = null;
                                    } else {
                                        document = null;
                                        oy9Var = null;
                                        jxcVar = null;
                                        fileLocation = null;
                                    }
                                    str = fileLocation;
                                }
                            }
                        }
                        xb4.G(wm5Var.o).h(this.b, document, oy9Var, jxcVar, fileLocation, str);
                    }
                }
                return;
            case 4:
                in5 in5Var2 = (in5) obj2;
                zm5 zm5Var = (zm5) obj;
                LinkedList linkedList = in5Var2.B;
                HashMap hashMap = in5Var2.C;
                if (zm5Var != null) {
                    File file2 = zm5Var.b;
                    in5Var2.E--;
                    int i6 = zm5Var.h;
                    String str4 = zm5Var.a;
                    if (b2 == 1) {
                        if (zm5Var.f) {
                            zm5 zm5Var2 = new zm5(in5Var2, zm5Var.a, file2, zm5Var.c, zm5Var.h);
                            in5Var2 = in5Var2;
                            tg5 tg5Var = new tg5(in5Var2, zm5Var2, (byte) 5);
                            in5Var2.D.put(str4, tg5Var);
                            hl.d3(tg5Var, 1000L);
                        } else {
                            hashMap.remove(str4);
                            jn7.f(i6).k(137, str4, 0);
                        }
                    } else if (b2 == 2) {
                        hashMap.remove(str4);
                        File file3 = new File(xb4.z(4), Utilities.a(str4) + "." + zm5Var.c);
                        if (file2.renameTo(file3)) {
                            file = file3.toString();
                        } else {
                            file = file2.toString();
                        }
                        jn7.f(i6).k(136, str4, file);
                    }
                }
                while (in5Var2.E < 2 && !linkedList.isEmpty()) {
                    ((zm5) linkedList.poll()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                    in5Var2.E++;
                }
                return;
            case 5:
                id6 id6Var = (id6) obj2;
                hd6 hd6Var = (hd6) obj;
                try {
                    if (b2 == 2) {
                        id6Var.getMessagesStorage().b.executeFast("DELETE FROM sharing_locations WHERE 1").stepThis().dispose();
                    } else if (b2 == 1) {
                        if (hd6Var != null) {
                            id6Var.getMessagesStorage().b.executeFast("DELETE FROM sharing_locations WHERE uid = " + hd6Var.a).stepThis().dispose();
                        } else {
                            return;
                        }
                    } else if (hd6Var != null) {
                        SQLitePreparedStatement executeFast = id6Var.getMessagesStorage().b.executeFast("REPLACE INTO sharing_locations VALUES(?, ?, ?, ?, ?, ?)");
                        executeFast.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(hd6Var.h.k.getObjectSize());
                        hd6Var.h.k.serializeToStream(nativeByteBuffer);
                        executeFast.bindLong(1, hd6Var.a);
                        executeFast.bindInteger(2, hd6Var.b);
                        executeFast.bindInteger(3, hd6Var.c);
                        executeFast.bindInteger(4, hd6Var.d);
                        executeFast.bindByteBuffer(5, nativeByteBuffer);
                        executeFast.bindInteger(6, hd6Var.f);
                        executeFast.step();
                        executeFast.dispose();
                        nativeByteBuffer.reuse();
                    } else {
                        return;
                    }
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 6:
                ls6 ls6Var = (ls6) obj2;
                TLRPC.Document document3 = (TLRPC.Document) obj;
                if (b2 == 0) {
                    i4 = 3;
                } else if (b2 == 1) {
                    i4 = 4;
                } else if (b2 == 5) {
                    i4 = 7;
                }
                try {
                    ls6Var.getMessagesStorage().b.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document3.id + "' AND type = " + i4).stepThis().dispose();
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
            case 7:
                ls6 ls6Var2 = (ls6) obj2;
                TL_account.TL_emojiStatuses tL_emojiStatuses = (TL_account.TL_emojiStatuses) obj;
                try {
                    ls6Var2.getMessagesStorage().b.executeFast("DELETE FROM emoji_statuses WHERE type = " + ((int) b2)).stepThis().dispose();
                    SQLitePreparedStatement executeFast2 = ls6Var2.getMessagesStorage().b.executeFast("INSERT INTO emoji_statuses VALUES(?, ?)");
                    executeFast2.requery();
                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(tL_emojiStatuses.getObjectSize());
                    tL_emojiStatuses.serializeToStream(nativeByteBuffer2);
                    executeFast2.bindByteBuffer(1, nativeByteBuffer2);
                    executeFast2.bindInteger(2, b2);
                    executeFast2.step();
                    nativeByteBuffer2.reuse();
                    executeFast2.dispose();
                } catch (Exception e3) {
                    cc4.g(e3, true);
                }
                ls6Var2.I0[b2] = false;
                return;
            case 8:
                ls6 ls6Var3 = (ls6) obj2;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) obj;
                ls6Var3.U.l(stickerSet.id);
                ls6Var3.c1(this.b, false, true, false, new jr6(ls6Var3, stickerSet, (byte) 1));
                return;
            case 9:
                Pair pair = (Pair) obj;
                ((f07) obj2).b.i.n(((Integer) pair.first).intValue(), (vz6) pair.second, b2);
                return;
            case 10:
                uc7 uc7Var = (uc7) obj2;
                oo2 oo2Var = (oo2) obj;
                if (oo2Var != null) {
                    oo2Var.a(Integer.valueOf(b2), null);
                }
                uc7Var.getNotificationCenter().k(2, 8192);
                return;
            case 11:
                jf7 jf7Var = (jf7) obj2;
                jf7Var.b1((TLRPC.messages_Dialogs) obj, b2);
                try {
                    jf7Var.a.c(new be7(jf7Var, (byte) 21));
                    return;
                } catch (Exception e4) {
                    jf7Var.n(e4, true);
                    return;
                }
            case 12:
                ArrayList arrayList2 = (ArrayList) obj;
                lq3 downloadController = ((jf7) obj2).getDownloadController();
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
                        mq3 mq3Var = (mq3) arrayList2.get(i7);
                        TLObject tLObject = mq3Var.a;
                        if (tLObject instanceof TLRPC.Document) {
                            str2 = xb4.r(null, (TLRPC.Document) tLObject);
                            photoSize = null;
                        } else if (tLObject instanceof TLRPC.Photo) {
                            TLRPC.PhotoSize w = xb4.w(((TLRPC.Photo) tLObject).sizes, hl.Y0(false), false, null, false);
                            photoSize = w;
                            str2 = xb4.r(null, w);
                        } else {
                            str2 = null;
                            photoSize = null;
                        }
                        if (str2 != null && !hashMap2.containsKey(str2)) {
                            TLObject tLObject2 = mq3Var.a;
                            if (photoSize != null) {
                                TLRPC.Photo photo = (TLRPC.Photo) tLObject2;
                                if (mq3Var.d) {
                                    i3 = 2;
                                } else if (mq3Var.e) {
                                    i3 = 1;
                                } else {
                                    i3 = 0;
                                }
                                downloadController.getFileLoader().V(jn5.i(photoSize, photo), mq3Var.f, null, 0, i3);
                            } else if (tLObject2 instanceof TLRPC.Document) {
                                TLRPC.Document document4 = (TLRPC.Document) tLObject2;
                                xb4 fileLoader = downloadController.getFileLoader();
                                String str5 = mq3Var.f;
                                if (mq3Var.d) {
                                    i2 = 2;
                                } else {
                                    i2 = 0;
                                }
                                fileLoader.X(document4, str5, 0, i2);
                            }
                            arrayList.add(mq3Var);
                            hashMap2.put(str2, mq3Var);
                            downloadController.h.put(new Pair(Long.valueOf(mq3Var.c), Integer.valueOf(mq3Var.b)), mq3Var);
                        }
                    }
                    return;
                }
                return;
            case 13:
                ((b18) obj2).x1((oy9) obj, b2);
                return;
            default:
                mk0 mk0Var = (mk0) obj;
                km9 km9Var = ((fm9) obj2).a;
                if (km9Var.E != null) {
                    km9.c(mk0Var.b, "");
                    ((zh9) km9Var.E).c(mk0Var, b2);
                    return;
                }
                return;
        }
    }

    public sb4(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
