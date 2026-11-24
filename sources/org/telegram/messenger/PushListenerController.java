package org.telegram.messenger;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public class PushListenerController {
    public static final int NOTIFICATION_ID = 1;
    public static final int PUSH_TYPE_FIREBASE = 2;
    public static final int PUSH_TYPE_HUAWEI = 13;
    private static CountDownLatch countDownLatch = new CountDownLatch(1);

    public interface IPushListenerServiceProvider {
        String getLogTitle();

        int getPushType();

        boolean hasServices();

        void onRequestPushToken();
    }

    private static String getReactedText(String str, Object[] objArr) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -2114646919:
                if (str.equals("CHAT_REACT_CONTACT")) {
                    c = 0;
                    break;
                }
                break;
            case -2050760307:
                if (str.equals("REACT_WALLET_TONCONNECT_REQUEST")) {
                    c = 1;
                    break;
                }
                break;
            case -2034154605:
                if (str.equals("CHAT_REACT_POLL_APPEND")) {
                    c = 2;
                    break;
                }
                break;
            case -1891797827:
                if (str.equals("REACT_GEOLIVE")) {
                    c = 3;
                    break;
                }
                break;
            case -1829444923:
                if (str.equals("REACT_GAME_SCORE")) {
                    c = 4;
                    break;
                }
                break;
            case -1773019340:
                if (str.equals("REACT_STORY_HIDDEN")) {
                    c = 5;
                    break;
                }
                break;
            case -1718627820:
                if (str.equals("CHAT_REACT_TODO_DONE")) {
                    c = 6;
                    break;
                }
                break;
            case -1653007066:
                if (str.equals("REACT_RECURRING_PAY")) {
                    c = 7;
                    break;
                }
                break;
            case -1613652961:
                if (str.equals("REACT_STARGIFT_UPGRADE")) {
                    c = '\b';
                    break;
                }
                break;
            case -1553058678:
                if (str.equals("REACT_HIDDEN")) {
                    c = '\t';
                    break;
                }
                break;
            case -1415696683:
                if (str.equals("CHAT_REACT_NOTEXT")) {
                    c = '\n';
                    break;
                }
                break;
            case -1414802228:
                if (str.equals("CHAT_REACT_GAME_SCORE")) {
                    c = 11;
                    break;
                }
                break;
            case -1375264434:
                if (str.equals("REACT_NOTEXT")) {
                    c = '\f';
                    break;
                }
                break;
            case -1328653219:
                if (str.equals("REACT_PHOTO_SECRET")) {
                    c = '\r';
                    break;
                }
                break;
            case -1139011838:
                if (str.equals("REACT_WALLPAPER")) {
                    c = 14;
                    break;
                }
                break;
            case -1105974394:
                if (str.equals("CHAT_REACT_INVOICE")) {
                    c = 15;
                    break;
                }
                break;
            case -936853247:
                if (str.equals("CHAT_REACT_NOTHEME")) {
                    c = 16;
                    break;
                }
                break;
            case -861247200:
                if (str.equals("REACT_CONTACT")) {
                    c = 17;
                    break;
                }
                break;
            case -679032657:
                if (str.equals("REACT_STARGIFT_PREPAID_UPGRADE")) {
                    c = 18;
                    break;
                }
                break;
            case -661458538:
                if (str.equals("CHAT_REACT_STICKER")) {
                    c = 19;
                    break;
                }
                break;
            case -469054423:
                if (str.equals("REACT_SAME_WALLPAPER")) {
                    c = 20;
                    break;
                }
                break;
            case -406329357:
                if (str.equals("REACT_GRAM_TRANSFER_COMMENT")) {
                    c = 21;
                    break;
                }
                break;
            case 51977938:
                if (str.equals("REACT_GAME")) {
                    c = 22;
                    break;
                }
                break;
            case 52259487:
                if (str.equals("REACT_POLL")) {
                    c = 23;
                    break;
                }
                break;
            case 52294965:
                if (str.equals("REACT_QUIZ")) {
                    c = 24;
                    break;
                }
                break;
            case 52369421:
                if (str.equals("REACT_TEXT")) {
                    c = 25;
                    break;
                }
                break;
            case 52378406:
                if (str.equals("REACT_TODO")) {
                    c = 26;
                    break;
                }
                break;
            case 147425325:
                if (str.equals("REACT_INVOICE")) {
                    c = 27;
                    break;
                }
                break;
            case 163030086:
                if (str.equals("REACT_SCREENSHOT")) {
                    c = 28;
                    break;
                }
                break;
            case 192842257:
                if (str.equals("CHAT_REACT_DOC")) {
                    c = 29;
                    break;
                }
                break;
            case 192844842:
                if (str.equals("CHAT_REACT_GEO")) {
                    c = 30;
                    break;
                }
                break;
            case 192844957:
                if (str.equals("CHAT_REACT_GIF")) {
                    c = 31;
                    break;
                }
                break;
            case 207659259:
                if (str.equals("REACT_TODO_DONE")) {
                    c = ' ';
                    break;
                }
                break;
            case 316546472:
                if (str.equals("REACT_NOTHEME")) {
                    c = '!';
                    break;
                }
                break;
            case 323643891:
                if (str.equals("REACT_GRAM_TRANSFER")) {
                    c = '\"';
                    break;
                }
                break;
            case 336123756:
                if (str.equals("REACT_STARGIFT_UNPACK_UPGRADE")) {
                    c = '#';
                    break;
                }
                break;
            case 488397309:
                if (str.equals("REACT_GIFTCODE")) {
                    c = '$';
                    break;
                }
                break;
            case 591941181:
                if (str.equals("REACT_STICKER")) {
                    c = '%';
                    break;
                }
                break;
            case 635226735:
                if (str.equals("CHAT_REACT_AUDIO")) {
                    c = '&';
                    break;
                }
                break;
            case 648703179:
                if (str.equals("CHAT_REACT_PHOTO")) {
                    c = '\'';
                    break;
                }
                break;
            case 650764327:
                if (str.equals("CHAT_REACT_ROUND")) {
                    c = '(';
                    break;
                }
                break;
            case 651831182:
                if (str.equals("CHAT_REACT_STORY")) {
                    c = ')';
                    break;
                }
                break;
            case 652387426:
                if (str.equals("CHAT_REACT_THEME")) {
                    c = '*';
                    break;
                }
                break;
            case 654263060:
                if (str.equals("CHAT_REACT_VIDEO")) {
                    c = '+';
                    break;
                }
                break;
            case 731873318:
                if (str.equals("CHAT_REACT_GIVEAWAY")) {
                    c = ',';
                    break;
                }
                break;
            case 858352720:
                if (str.equals("REACT_UNIQUE_STARGIFT")) {
                    c = '-';
                    break;
                }
                break;
            case 908725632:
                if (str.equals("REACT_STORY_MENTION")) {
                    c = '.';
                    break;
                }
                break;
            case 917562465:
                if (str.equals("REACT_GIVEAWAY_STARS")) {
                    c = '/';
                    break;
                }
                break;
            case 932558943:
                if (str.equals("REACT_GIVEAWAY")) {
                    c = '0';
                    break;
                }
                break;
            case 955011426:
                if (str.equals("REACT_STARGIFT")) {
                    c = '1';
                    break;
                }
                break;
            case 1149769750:
                if (str.equals("CHAT_REACT_GEOLIVE")) {
                    c = '2';
                    break;
                }
                break;
            case 1152553460:
                if (str.equals("REACT_VIDEO_SECRET")) {
                    c = '3';
                    break;
                }
                break;
            case 1183753176:
                if (str.equals("REACT_SUGGEST_BIRTHDAY")) {
                    c = '4';
                    break;
                }
                break;
            case 1191219583:
                if (str.equals("REACT_PROXIMITY")) {
                    c = '5';
                    break;
                }
                break;
            case 1422598001:
                if (str.equals("REACT_PAID_MEDIA")) {
                    c = '6';
                    break;
                }
                break;
            case 1606362326:
                if (str.equals("REACT_AUDIO")) {
                    c = '7';
                    break;
                }
                break;
            case 1619838770:
                if (str.equals("REACT_PHOTO")) {
                    c = '8';
                    break;
                }
                break;
            case 1621899918:
                if (str.equals("REACT_ROUND")) {
                    c = '9';
                    break;
                }
                break;
            case 1622966773:
                if (str.equals("REACT_STORY")) {
                    c = ':';
                    break;
                }
                break;
            case 1623523017:
                if (str.equals("REACT_THEME")) {
                    c = ';';
                    break;
                }
                break;
            case 1625398651:
                if (str.equals("REACT_VIDEO")) {
                    c = '<';
                    break;
                }
                break;
            case 1657688324:
                if (str.equals("REACT_SUGGEST_USERPIC")) {
                    c = '=';
                    break;
                }
                break;
            case 1664242232:
                if (str.equals("REACT_DOC")) {
                    c = '>';
                    break;
                }
                break;
            case 1664244817:
                if (str.equals("REACT_GEO")) {
                    c = '?';
                    break;
                }
                break;
            case 1664244932:
                if (str.equals("REACT_GIF")) {
                    c = '@';
                    break;
                }
                break;
            case 1683218969:
                if (str.equals("CHAT_REACT_GAME")) {
                    c = 'A';
                    break;
                }
                break;
            case 1683500518:
                if (str.equals("CHAT_REACT_POLL")) {
                    c = 'B';
                    break;
                }
                break;
            case 1683535996:
                if (str.equals("CHAT_REACT_QUIZ")) {
                    c = 'C';
                    break;
                }
                break;
            case 1683610452:
                if (str.equals("CHAT_REACT_TEXT")) {
                    c = 'D';
                    break;
                }
                break;
            case 1683619437:
                if (str.equals("CHAT_REACT_TODO")) {
                    c = 'E';
                    break;
                }
                break;
            case 1876172076:
                if (str.equals("CHAT_REACT_TODO_APPEND")) {
                    c = 'F';
                    break;
                }
                break;
            case 1907150419:
                if (str.equals("REACT_TODO_APPEND")) {
                    c = 'G';
                    break;
                }
                break;
            case 2004734138:
                if (str.equals("REACT_GIFT_THEME")) {
                    c = 'H';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return jb6.a0(null, null, 2131746307, objArr);
            case 1:
                return jb6.a0(null, null, 2131746244, objArr);
            case 2:
                return jb6.a0(null, null, 2131746296, objArr);
            case 3:
                return jb6.a0(null, null, 2131746280, objArr);
            case 4:
                return jb6.a0(null, null, 2131746282, objArr);
            case 5:
                return jb6.a0(null, null, 2131746256, objArr);
            case 6:
            case 'F':
                return jb6.a0(null, null, 2131746288, objArr);
            case 7:
                return jb6.a0(null, null, 2131746266, objArr);
            case '\b':
                return jb6.a0(null, null, 2131746259, objArr);
            case '\t':
                return jb6.a0(null, null, 2131746275, objArr);
            case '\n':
                return jb6.a0(null, null, 2131746299, objArr);
            case 11:
                return jb6.a0(null, null, 2131746304, objArr);
            case '\f':
                return jb6.a0(null, null, 2131746273, objArr);
            case '\r':
                return jb6.a0(null, null, 2131746270, objArr);
            case 14:
                return jb6.a0(null, null, 2131746243, objArr);
            case 15:
                return jb6.a0(null, null, 2131746300, objArr);
            case 16:
            case '*':
                return jb6.a0(null, null, 2131746290, objArr);
            case 17:
                return jb6.a0(null, null, 2131746285, objArr);
            case 18:
                return jb6.a0(null, null, 2131746261, objArr);
            case 19:
                return jb6.a0(null, null, 2131746293, objArr);
            case 20:
                return jb6.a0(null, null, 2131746264, objArr);
            case 21:
                return jb6.a0(null, null, 2131746276, objArr);
            case 22:
                return jb6.a0(null, null, 2131746283, objArr);
            case 23:
                return jb6.a0(null, null, 2131746269, objArr);
            case 24:
                return jb6.a0(null, null, 2131746267, objArr);
            case 25:
                return jb6.a0(null, null, 2131746251, objArr);
            case 26:
                return jb6.a0(null, null, 2131746249, objArr);
            case 27:
                return jb6.a0(null, null, 2131746274, objArr);
            case 28:
                return jb6.a0(null, null, 2131746263, objArr);
            case 29:
                return jb6.a0(null, null, 2131746306, objArr);
            case 30:
                return jb6.a0(null, null, 2131746303, objArr);
            case 31:
                return jb6.a0(null, null, 2131746301, objArr);
            case ' ':
            case 'G':
                return jb6.a0(null, null, 2131746248, objArr);
            case '!':
            case ';':
            case 'H':
                return jb6.a0(null, null, 2131746250, objArr);
            case '\"':
                return jb6.a0(null, null, 2131746277, objArr);
            case '#':
                return jb6.a0(null, null, 2131746260, objArr);
            case '$':
                return jb6.a0(null, null, 2131746278, objArr);
            case '%':
                return jb6.a0(null, null, 2131746258, objArr);
            case '&':
                return jb6.a0(null, null, 2131746308, objArr);
            case '\'':
                return jb6.a0(null, null, 2131746298, objArr);
            case '(':
                return jb6.a0(null, null, 2131746294, objArr);
            case ')':
                return jb6.a0(null, null, 2131746292, objArr);
            case '+':
                return jb6.a0(null, null, 2131746287, objArr);
            case ',':
                return jb6.a0(null, null, 2131747782, objArr);
            case '-':
                return jb6.a0(null, null, 2131746247, objArr);
            case '.':
                return jb6.a0(null, null, 2131746254, objArr);
            case '/':
                return jb6.a0(null, null, 2131747670, objArr);
            case '0':
                return jb6.a0(null, null, 2131747670, objArr);
            case '1':
                return jb6.a0(null, null, 2131746262, objArr);
            case '2':
                return jb6.a0(null, null, 2131746302, objArr);
            case '3':
                return jb6.a0(null, null, 2131746245, objArr);
            case '4':
                return jb6.a0(null, null, 2131746253, objArr);
            case '5':
                return jb6.a0(null, null, 2131746268, objArr);
            case '6':
                return jb6.a0(null, null, 2131746272, objArr);
            case '7':
                return jb6.a0(null, null, 2131746286, objArr);
            case '8':
                return jb6.a0(null, null, 2131746271, objArr);
            case '9':
                return jb6.a0(null, null, 2131746265, objArr);
            case ':':
                return jb6.a0(null, null, 2131746257, objArr);
            case '<':
                return jb6.a0(null, null, 2131746246, objArr);
            case '=':
                return jb6.a0(null, null, 2131746252, objArr);
            case '>':
                return jb6.a0(null, null, 2131746284, objArr);
            case '?':
                return jb6.a0(null, null, 2131746281, objArr);
            case '@':
                return jb6.a0(null, null, 2131746279, objArr);
            case 'A':
                return jb6.a0(null, null, 2131746305, objArr);
            case 'B':
                return jb6.a0(null, null, 2131746297, objArr);
            case 'C':
                return jb6.a0(null, null, 2131746295, objArr);
            case 'D':
                return jb6.a0(null, null, 2131746291, objArr);
            case 'E':
                return jb6.a0(null, null, 2131746289, objArr);
            default:
                return null;
        }
    }

    public static void lambda$processRemoteMessage$2(int i, TLRPC.TL_updates tL_updates) {
        oc7.r1(i).T3(tL_updates, false);
    }

    public static void lambda$processRemoteMessage$3(int i) {
        if (z8c.h(i).e() != 0) {
            z8c.h(i).b();
            oc7.r1(i).E3(0);
        }
    }

    public static void lambda$processRemoteMessage$4(int i) {
        dd6 f = dd6.f(i);
        if (f.b.isEmpty()) {
            return;
        }
        f.I = SystemClock.elapsedRealtime() + 65000;
        f.p();
    }

    public static void lambda$processRemoteMessage$5(int i, long j, int i2) {
        oc7.r1(i).s4(i2, j, true);
    }

    public static void lambda$processRemoteMessage$6(java.lang.String r86, java.lang.String r87, long r88) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.PushListenerController.lambda$processRemoteMessage$6(java.lang.String, java.lang.String, long):void");
    }

    public static void lambda$processRemoteMessage$7(String str, String str2, long j) {
        if (e21.a) {
            fc4.b(str + " PRE INIT APP");
        }
        a.v();
        if (e21.a) {
            fc4.b(str + " POST INIT APP");
        }
        Utilities.d.c(new zw8(str, str2, j, (byte) 0));
    }

    public static void lambda$sendRegistrationToServer$0(int i, int i2, String str) {
        oc7.r1(i).e4(i2, str);
    }

    public static void lambda$sendRegistrationToServer$1(String str, int i) {
        boolean z;
        String str2;
        ConnectionsManager.setRegId(str, i, gda.g);
        if (str != null) {
            if (gda.h != 0 && gda.i != 0 && (!gda.j || !TextUtils.equals(gda.f, str))) {
                gda.j = false;
                z = true;
            } else {
                z = false;
            }
            gda.f = str;
            gda.e = i;
            for (int i2 = 0; i2 < 4; i2++) {
                z8c h = z8c.h(i2);
                h.d = false;
                h.u(false);
                if (h.e() != 0) {
                    if (z) {
                        if (i == 2) {
                            str2 = "fcm";
                        } else {
                            str2 = "hcm";
                        }
                        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
                        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
                        tL_inputAppEvent.time = gda.h;
                        tL_inputAppEvent.type = str2.concat("_token_request");
                        tL_inputAppEvent.peer = 0L;
                        tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
                        tL_help_saveAppLog.events.add(tL_inputAppEvent);
                        TLRPC.TL_inputAppEvent tL_inputAppEvent2 = new TLRPC.TL_inputAppEvent();
                        tL_inputAppEvent2.time = gda.i;
                        tL_inputAppEvent2.type = str2.concat("_token_response");
                        tL_inputAppEvent2.peer = gda.i - gda.h;
                        tL_inputAppEvent2.data = new TLRPC.TL_jsonNull();
                        tL_help_saveAppLog.events.add(tL_inputAppEvent2);
                        gda.j = true;
                        gda.x();
                        ConnectionsManager.getInstance(i2).sendRequest(tL_help_saveAppLog, null);
                        z = false;
                    }
                    gm.c3(new cu(i2, i, str, (byte) 13));
                }
            }
        }
    }

    private static void onDecryptError() {
        for (int i = 0; i < 4; i++) {
            if (z8c.h(i).o()) {
                ConnectionsManager.onInternalPushReceived(i);
                ConnectionsManager.getInstance(i).resumeNetworkMaybe();
            }
        }
        countDownLatch.countDown();
    }

    public static void processRemoteMessage(int i, String str, long j) {
        String str2;
        if (i == 2) {
            str2 = "FCM";
        } else {
            str2 = "HCM";
        }
        String str3 = str2;
        if (e21.a) {
            fc4.b(str3.concat(" PRE START PROCESSING"));
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        gm.c3(new zw8(str3, str, j, (byte) 1));
        try {
            countDownLatch.await();
        } catch (Throwable unused) {
        }
        boolean z = e21.a;
        StringBuilder p = wi8.p("finished ", str3, " service, time = ");
        p.append(SystemClock.elapsedRealtime() - elapsedRealtime);
        fc4.b(p.toString());
    }

    public static void sendRegistrationToServer(int i, String str) {
        Utilities.d.c(new rr7(str, i));
    }
}
