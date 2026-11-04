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
        char c2 = 65535;
        switch (str.hashCode()) {
            case -2114646919:
                if (str.equals("CHAT_REACT_CONTACT")) {
                    c2 = 0;
                    break;
                }
                break;
            case -2050760307:
                if (str.equals("REACT_WALLET_TONCONNECT_REQUEST")) {
                    c2 = 1;
                    break;
                }
                break;
            case -2034154605:
                if (str.equals("CHAT_REACT_POLL_APPEND")) {
                    c2 = 2;
                    break;
                }
                break;
            case -1891797827:
                if (str.equals("REACT_GEOLIVE")) {
                    c2 = 3;
                    break;
                }
                break;
            case -1829444923:
                if (str.equals("REACT_GAME_SCORE")) {
                    c2 = 4;
                    break;
                }
                break;
            case -1773019340:
                if (str.equals("REACT_STORY_HIDDEN")) {
                    c2 = 5;
                    break;
                }
                break;
            case -1718627820:
                if (str.equals("CHAT_REACT_TODO_DONE")) {
                    c2 = 6;
                    break;
                }
                break;
            case -1653007066:
                if (str.equals("REACT_RECURRING_PAY")) {
                    c2 = 7;
                    break;
                }
                break;
            case -1613652961:
                if (str.equals("REACT_STARGIFT_UPGRADE")) {
                    c2 = '\b';
                    break;
                }
                break;
            case -1553058678:
                if (str.equals("REACT_HIDDEN")) {
                    c2 = '\t';
                    break;
                }
                break;
            case -1415696683:
                if (str.equals("CHAT_REACT_NOTEXT")) {
                    c2 = '\n';
                    break;
                }
                break;
            case -1414802228:
                if (str.equals("CHAT_REACT_GAME_SCORE")) {
                    c2 = 11;
                    break;
                }
                break;
            case -1375264434:
                if (str.equals("REACT_NOTEXT")) {
                    c2 = '\f';
                    break;
                }
                break;
            case -1328653219:
                if (str.equals("REACT_PHOTO_SECRET")) {
                    c2 = '\r';
                    break;
                }
                break;
            case -1139011838:
                if (str.equals("REACT_WALLPAPER")) {
                    c2 = 14;
                    break;
                }
                break;
            case -1105974394:
                if (str.equals("CHAT_REACT_INVOICE")) {
                    c2 = 15;
                    break;
                }
                break;
            case -936853247:
                if (str.equals("CHAT_REACT_NOTHEME")) {
                    c2 = 16;
                    break;
                }
                break;
            case -861247200:
                if (str.equals("REACT_CONTACT")) {
                    c2 = 17;
                    break;
                }
                break;
            case -679032657:
                if (str.equals("REACT_STARGIFT_PREPAID_UPGRADE")) {
                    c2 = 18;
                    break;
                }
                break;
            case -661458538:
                if (str.equals("CHAT_REACT_STICKER")) {
                    c2 = 19;
                    break;
                }
                break;
            case -469054423:
                if (str.equals("REACT_SAME_WALLPAPER")) {
                    c2 = 20;
                    break;
                }
                break;
            case -406329357:
                if (str.equals("REACT_GRAM_TRANSFER_COMMENT")) {
                    c2 = 21;
                    break;
                }
                break;
            case 51977938:
                if (str.equals("REACT_GAME")) {
                    c2 = 22;
                    break;
                }
                break;
            case 52259487:
                if (str.equals("REACT_POLL")) {
                    c2 = 23;
                    break;
                }
                break;
            case 52294965:
                if (str.equals("REACT_QUIZ")) {
                    c2 = 24;
                    break;
                }
                break;
            case 52369421:
                if (str.equals("REACT_TEXT")) {
                    c2 = 25;
                    break;
                }
                break;
            case 52378406:
                if (str.equals("REACT_TODO")) {
                    c2 = 26;
                    break;
                }
                break;
            case 147425325:
                if (str.equals("REACT_INVOICE")) {
                    c2 = 27;
                    break;
                }
                break;
            case 163030086:
                if (str.equals("REACT_SCREENSHOT")) {
                    c2 = 28;
                    break;
                }
                break;
            case 192842257:
                if (str.equals("CHAT_REACT_DOC")) {
                    c2 = 29;
                    break;
                }
                break;
            case 192844842:
                if (str.equals("CHAT_REACT_GEO")) {
                    c2 = 30;
                    break;
                }
                break;
            case 192844957:
                if (str.equals("CHAT_REACT_GIF")) {
                    c2 = 31;
                    break;
                }
                break;
            case 207659259:
                if (str.equals("REACT_TODO_DONE")) {
                    c2 = ' ';
                    break;
                }
                break;
            case 316546472:
                if (str.equals("REACT_NOTHEME")) {
                    c2 = '!';
                    break;
                }
                break;
            case 323643891:
                if (str.equals("REACT_GRAM_TRANSFER")) {
                    c2 = '\"';
                    break;
                }
                break;
            case 336123756:
                if (str.equals("REACT_STARGIFT_UNPACK_UPGRADE")) {
                    c2 = '#';
                    break;
                }
                break;
            case 488397309:
                if (str.equals("REACT_GIFTCODE")) {
                    c2 = '$';
                    break;
                }
                break;
            case 591941181:
                if (str.equals("REACT_STICKER")) {
                    c2 = '%';
                    break;
                }
                break;
            case 635226735:
                if (str.equals("CHAT_REACT_AUDIO")) {
                    c2 = '&';
                    break;
                }
                break;
            case 648703179:
                if (str.equals("CHAT_REACT_PHOTO")) {
                    c2 = '\'';
                    break;
                }
                break;
            case 650764327:
                if (str.equals("CHAT_REACT_ROUND")) {
                    c2 = '(';
                    break;
                }
                break;
            case 651831182:
                if (str.equals("CHAT_REACT_STORY")) {
                    c2 = ')';
                    break;
                }
                break;
            case 652387426:
                if (str.equals("CHAT_REACT_THEME")) {
                    c2 = '*';
                    break;
                }
                break;
            case 654263060:
                if (str.equals("CHAT_REACT_VIDEO")) {
                    c2 = '+';
                    break;
                }
                break;
            case 731873318:
                if (str.equals("CHAT_REACT_GIVEAWAY")) {
                    c2 = ',';
                    break;
                }
                break;
            case 858352720:
                if (str.equals("REACT_UNIQUE_STARGIFT")) {
                    c2 = '-';
                    break;
                }
                break;
            case 908725632:
                if (str.equals("REACT_STORY_MENTION")) {
                    c2 = '.';
                    break;
                }
                break;
            case 917562465:
                if (str.equals("REACT_GIVEAWAY_STARS")) {
                    c2 = '/';
                    break;
                }
                break;
            case 932558943:
                if (str.equals("REACT_GIVEAWAY")) {
                    c2 = '0';
                    break;
                }
                break;
            case 955011426:
                if (str.equals("REACT_STARGIFT")) {
                    c2 = '1';
                    break;
                }
                break;
            case 1149769750:
                if (str.equals("CHAT_REACT_GEOLIVE")) {
                    c2 = '2';
                    break;
                }
                break;
            case 1152553460:
                if (str.equals("REACT_VIDEO_SECRET")) {
                    c2 = '3';
                    break;
                }
                break;
            case 1183753176:
                if (str.equals("REACT_SUGGEST_BIRTHDAY")) {
                    c2 = '4';
                    break;
                }
                break;
            case 1191219583:
                if (str.equals("REACT_PROXIMITY")) {
                    c2 = '5';
                    break;
                }
                break;
            case 1422598001:
                if (str.equals("REACT_PAID_MEDIA")) {
                    c2 = '6';
                    break;
                }
                break;
            case 1606362326:
                if (str.equals("REACT_AUDIO")) {
                    c2 = '7';
                    break;
                }
                break;
            case 1619838770:
                if (str.equals("REACT_PHOTO")) {
                    c2 = '8';
                    break;
                }
                break;
            case 1621899918:
                if (str.equals("REACT_ROUND")) {
                    c2 = '9';
                    break;
                }
                break;
            case 1622966773:
                if (str.equals("REACT_STORY")) {
                    c2 = ':';
                    break;
                }
                break;
            case 1623523017:
                if (str.equals("REACT_THEME")) {
                    c2 = ';';
                    break;
                }
                break;
            case 1625398651:
                if (str.equals("REACT_VIDEO")) {
                    c2 = '<';
                    break;
                }
                break;
            case 1657688324:
                if (str.equals("REACT_SUGGEST_USERPIC")) {
                    c2 = '=';
                    break;
                }
                break;
            case 1664242232:
                if (str.equals("REACT_DOC")) {
                    c2 = '>';
                    break;
                }
                break;
            case 1664244817:
                if (str.equals("REACT_GEO")) {
                    c2 = '?';
                    break;
                }
                break;
            case 1664244932:
                if (str.equals("REACT_GIF")) {
                    c2 = '@';
                    break;
                }
                break;
            case 1683218969:
                if (str.equals("CHAT_REACT_GAME")) {
                    c2 = 'A';
                    break;
                }
                break;
            case 1683500518:
                if (str.equals("CHAT_REACT_POLL")) {
                    c2 = 'B';
                    break;
                }
                break;
            case 1683535996:
                if (str.equals("CHAT_REACT_QUIZ")) {
                    c2 = 'C';
                    break;
                }
                break;
            case 1683610452:
                if (str.equals("CHAT_REACT_TEXT")) {
                    c2 = 'D';
                    break;
                }
                break;
            case 1683619437:
                if (str.equals("CHAT_REACT_TODO")) {
                    c2 = 'E';
                    break;
                }
                break;
            case 1876172076:
                if (str.equals("CHAT_REACT_TODO_APPEND")) {
                    c2 = 'F';
                    break;
                }
                break;
            case 1907150419:
                if (str.equals("REACT_TODO_APPEND")) {
                    c2 = 'G';
                    break;
                }
                break;
            case 2004734138:
                if (str.equals("REACT_GIFT_THEME")) {
                    c2 = 'H';
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return bd.a0(null, null, 2131746582, objArr);
            case 1:
                return bd.a0(null, null, 2131746519, objArr);
            case 2:
                return bd.a0(null, null, 2131746571, objArr);
            case 3:
                return bd.a0(null, null, 2131746555, objArr);
            case 4:
                return bd.a0(null, null, 2131746557, objArr);
            case 5:
                return bd.a0(null, null, 2131746531, objArr);
            case 6:
            case 'F':
                return bd.a0(null, null, 2131746563, objArr);
            case 7:
                return bd.a0(null, null, 2131746541, objArr);
            case '\b':
                return bd.a0(null, null, 2131746534, objArr);
            case '\t':
                return bd.a0(null, null, 2131746550, objArr);
            case '\n':
                return bd.a0(null, null, 2131746574, objArr);
            case 11:
                return bd.a0(null, null, 2131746579, objArr);
            case '\f':
                return bd.a0(null, null, 2131746548, objArr);
            case '\r':
                return bd.a0(null, null, 2131746545, objArr);
            case 14:
                return bd.a0(null, null, 2131746518, objArr);
            case 15:
                return bd.a0(null, null, 2131746575, objArr);
            case 16:
            case '*':
                return bd.a0(null, null, 2131746565, objArr);
            case 17:
                return bd.a0(null, null, 2131746560, objArr);
            case 18:
                return bd.a0(null, null, 2131746536, objArr);
            case 19:
                return bd.a0(null, null, 2131746568, objArr);
            case 20:
                return bd.a0(null, null, 2131746539, objArr);
            case 21:
                return bd.a0(null, null, 2131746551, objArr);
            case 22:
                return bd.a0(null, null, 2131746558, objArr);
            case 23:
                return bd.a0(null, null, 2131746544, objArr);
            case 24:
                return bd.a0(null, null, 2131746542, objArr);
            case 25:
                return bd.a0(null, null, 2131746526, objArr);
            case 26:
                return bd.a0(null, null, 2131746524, objArr);
            case 27:
                return bd.a0(null, null, 2131746549, objArr);
            case 28:
                return bd.a0(null, null, 2131746538, objArr);
            case 29:
                return bd.a0(null, null, 2131746581, objArr);
            case 30:
                return bd.a0(null, null, 2131746578, objArr);
            case 31:
                return bd.a0(null, null, 2131746576, objArr);
            case ' ':
            case 'G':
                return bd.a0(null, null, 2131746523, objArr);
            case '!':
            case ';':
            case 'H':
                return bd.a0(null, null, 2131746525, objArr);
            case '\"':
                return bd.a0(null, null, 2131746552, objArr);
            case '#':
                return bd.a0(null, null, 2131746535, objArr);
            case '$':
                return bd.a0(null, null, 2131746553, objArr);
            case '%':
                return bd.a0(null, null, 2131746533, objArr);
            case '&':
                return bd.a0(null, null, 2131746583, objArr);
            case '\'':
                return bd.a0(null, null, 2131746573, objArr);
            case '(':
                return bd.a0(null, null, 2131746569, objArr);
            case ')':
                return bd.a0(null, null, 2131746567, objArr);
            case '+':
                return bd.a0(null, null, 2131746562, objArr);
            case ',':
                return bd.a0(null, null, 2131748056, objArr);
            case '-':
                return bd.a0(null, null, 2131746522, objArr);
            case '.':
                return bd.a0(null, null, 2131746529, objArr);
            case '/':
                return bd.a0(null, null, 2131747945, objArr);
            case '0':
                return bd.a0(null, null, 2131747945, objArr);
            case '1':
                return bd.a0(null, null, 2131746537, objArr);
            case '2':
                return bd.a0(null, null, 2131746577, objArr);
            case '3':
                return bd.a0(null, null, 2131746520, objArr);
            case '4':
                return bd.a0(null, null, 2131746528, objArr);
            case '5':
                return bd.a0(null, null, 2131746543, objArr);
            case '6':
                return bd.a0(null, null, 2131746547, objArr);
            case '7':
                return bd.a0(null, null, 2131746561, objArr);
            case '8':
                return bd.a0(null, null, 2131746546, objArr);
            case '9':
                return bd.a0(null, null, 2131746540, objArr);
            case ':':
                return bd.a0(null, null, 2131746532, objArr);
            case '<':
                return bd.a0(null, null, 2131746521, objArr);
            case '=':
                return bd.a0(null, null, 2131746527, objArr);
            case '>':
                return bd.a0(null, null, 2131746559, objArr);
            case '?':
                return bd.a0(null, null, 2131746556, objArr);
            case '@':
                return bd.a0(null, null, 2131746554, objArr);
            case 'A':
                return bd.a0(null, null, 2131746580, objArr);
            case 'B':
                return bd.a0(null, null, 2131746572, objArr);
            case 'C':
                return bd.a0(null, null, 2131746570, objArr);
            case 'D':
                return bd.a0(null, null, 2131746566, objArr);
            case 'E':
                return bd.a0(null, null, 2131746564, objArr);
            default:
                return null;
        }
    }

    public static void lambda$processRemoteMessage$2(int i3, TLRPC.TL_updates tL_updates) {
        hp.s1(i3).O3(tL_updates, false);
    }

    public static void lambda$processRemoteMessage$3(int i3) {
        if (h10.i(i3).e() != 0) {
            h10.i(i3).b();
            hp.s1(i3).A3(0);
        }
    }

    public static void lambda$processRemoteMessage$4(int i3) {
        ld f10 = ld.f(i3);
        if (f10.f23975b.isEmpty()) {
            return;
        }
        f10.I = SystemClock.elapsedRealtime() + 65000;
        f10.p();
    }

    public static void lambda$processRemoteMessage$5(int i3, long j10, int i10) {
        hp.s1(i3).n4(i10, j10, true);
    }

    public static void lambda$processRemoteMessage$6(java.lang.String r86, java.lang.String r87, long r88) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.PushListenerController.lambda$processRemoteMessage$6(java.lang.String, java.lang.String, long):void");
    }

    public static void lambda$processRemoteMessage$7(String str, String str2, long j10) {
        if (r2.f25040a) {
            a8.b(str + " PRE INIT APP");
        }
        t0.w();
        if (r2.f25040a) {
            a8.b(str + " POST INIT APP");
        }
        Utilities.d.c(new kt(0, j10, str, str2));
    }

    public static void lambda$sendRegistrationToServer$0(int i3, int i10, String str) {
        hp.s1(i3).Z3(i10, str);
    }

    public static void lambda$sendRegistrationToServer$1(String str, int i3) {
        boolean z10;
        String str2;
        ConnectionsManager.setRegId(str, i3, az.h);
        if (str != null) {
            if (az.f21634i != 0 && az.f21637j != 0 && (!az.f21640k || !TextUtils.equals(az.f21629g, str))) {
                az.f21640k = false;
                z10 = true;
            } else {
                z10 = false;
            }
            az.f21629g = str;
            az.f21626f = i3;
            for (int i10 = 0; i10 < 4; i10++) {
                h10 i11 = h10.i(i10);
                i11.d = false;
                i11.v(false);
                if (i11.e() != 0) {
                    if (z10) {
                        if (i3 == 2) {
                            str2 = "fcm";
                        } else {
                            str2 = "hcm";
                        }
                        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
                        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
                        tL_inputAppEvent.time = az.f21634i;
                        tL_inputAppEvent.type = str2.concat("_token_request");
                        tL_inputAppEvent.peer = 0L;
                        tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
                        tL_help_saveAppLog.events.add(tL_inputAppEvent);
                        TLRPC.TL_inputAppEvent tL_inputAppEvent2 = new TLRPC.TL_inputAppEvent();
                        tL_inputAppEvent2.time = az.f21637j;
                        tL_inputAppEvent2.type = str2.concat("_token_response");
                        tL_inputAppEvent2.peer = az.f21637j - az.f21634i;
                        tL_inputAppEvent2.data = new TLRPC.TL_jsonNull();
                        tL_help_saveAppLog.events.add(tL_inputAppEvent2);
                        az.f21640k = true;
                        az.y();
                        ConnectionsManager.getInstance(i10).sendRequest(tL_help_saveAppLog, null);
                        z10 = false;
                    }
                    g0.h3(new k2.u(i10, i3, str, 5));
                }
            }
        }
    }

    private static void onDecryptError() {
        for (int i3 = 0; i3 < 4; i3++) {
            if (h10.i(i3).p()) {
                ConnectionsManager.onInternalPushReceived(i3);
                ConnectionsManager.getInstance(i3).resumeNetworkMaybe();
            }
        }
        countDownLatch.countDown();
    }

    public static void processRemoteMessage(int i3, String str, long j10) {
        String str2;
        if (i3 == 2) {
            str2 = "FCM";
        } else {
            str2 = "HCM";
        }
        String str3 = str2;
        if (r2.f25040a) {
            a8.b(str3.concat(" PRE START PROCESSING"));
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        g0.h3(new kt(1, j10, str3, str));
        try {
            countDownLatch.await();
        } catch (Throwable unused) {
        }
        boolean z10 = r2.f25040a;
        StringBuilder u10 = a1.g.u("finished ", str3, " service, time = ");
        u10.append(SystemClock.elapsedRealtime() - elapsedRealtime);
        a8.b(u10.toString());
    }

    public static void sendRegistrationToServer(int i3, String str) {
        Utilities.d.c(new x0(str, i3, 10));
    }
}
