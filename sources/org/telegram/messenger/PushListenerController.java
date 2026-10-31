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
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2114646919:
                if (str.equals("CHAT_REACT_CONTACT")) {
                    c10 = 0;
                    break;
                }
                break;
            case -2050760307:
                if (str.equals("REACT_WALLET_TONCONNECT_REQUEST")) {
                    c10 = 1;
                    break;
                }
                break;
            case -2034154605:
                if (str.equals("CHAT_REACT_POLL_APPEND")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1891797827:
                if (str.equals("REACT_GEOLIVE")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1829444923:
                if (str.equals("REACT_GAME_SCORE")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1773019340:
                if (str.equals("REACT_STORY_HIDDEN")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1718627820:
                if (str.equals("CHAT_REACT_TODO_DONE")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1653007066:
                if (str.equals("REACT_RECURRING_PAY")) {
                    c10 = 7;
                    break;
                }
                break;
            case -1613652961:
                if (str.equals("REACT_STARGIFT_UPGRADE")) {
                    c10 = '\b';
                    break;
                }
                break;
            case -1553058678:
                if (str.equals("REACT_HIDDEN")) {
                    c10 = '\t';
                    break;
                }
                break;
            case -1415696683:
                if (str.equals("CHAT_REACT_NOTEXT")) {
                    c10 = '\n';
                    break;
                }
                break;
            case -1414802228:
                if (str.equals("CHAT_REACT_GAME_SCORE")) {
                    c10 = 11;
                    break;
                }
                break;
            case -1375264434:
                if (str.equals("REACT_NOTEXT")) {
                    c10 = '\f';
                    break;
                }
                break;
            case -1328653219:
                if (str.equals("REACT_PHOTO_SECRET")) {
                    c10 = '\r';
                    break;
                }
                break;
            case -1139011838:
                if (str.equals("REACT_WALLPAPER")) {
                    c10 = 14;
                    break;
                }
                break;
            case -1105974394:
                if (str.equals("CHAT_REACT_INVOICE")) {
                    c10 = 15;
                    break;
                }
                break;
            case -936853247:
                if (str.equals("CHAT_REACT_NOTHEME")) {
                    c10 = 16;
                    break;
                }
                break;
            case -861247200:
                if (str.equals("REACT_CONTACT")) {
                    c10 = 17;
                    break;
                }
                break;
            case -679032657:
                if (str.equals("REACT_STARGIFT_PREPAID_UPGRADE")) {
                    c10 = 18;
                    break;
                }
                break;
            case -661458538:
                if (str.equals("CHAT_REACT_STICKER")) {
                    c10 = 19;
                    break;
                }
                break;
            case -469054423:
                if (str.equals("REACT_SAME_WALLPAPER")) {
                    c10 = 20;
                    break;
                }
                break;
            case -406329357:
                if (str.equals("REACT_GRAM_TRANSFER_COMMENT")) {
                    c10 = 21;
                    break;
                }
                break;
            case 51977938:
                if (str.equals("REACT_GAME")) {
                    c10 = 22;
                    break;
                }
                break;
            case 52259487:
                if (str.equals("REACT_POLL")) {
                    c10 = 23;
                    break;
                }
                break;
            case 52294965:
                if (str.equals("REACT_QUIZ")) {
                    c10 = 24;
                    break;
                }
                break;
            case 52369421:
                if (str.equals("REACT_TEXT")) {
                    c10 = 25;
                    break;
                }
                break;
            case 52378406:
                if (str.equals("REACT_TODO")) {
                    c10 = 26;
                    break;
                }
                break;
            case 147425325:
                if (str.equals("REACT_INVOICE")) {
                    c10 = 27;
                    break;
                }
                break;
            case 163030086:
                if (str.equals("REACT_SCREENSHOT")) {
                    c10 = 28;
                    break;
                }
                break;
            case 192842257:
                if (str.equals("CHAT_REACT_DOC")) {
                    c10 = 29;
                    break;
                }
                break;
            case 192844842:
                if (str.equals("CHAT_REACT_GEO")) {
                    c10 = 30;
                    break;
                }
                break;
            case 192844957:
                if (str.equals("CHAT_REACT_GIF")) {
                    c10 = 31;
                    break;
                }
                break;
            case 207659259:
                if (str.equals("REACT_TODO_DONE")) {
                    c10 = ' ';
                    break;
                }
                break;
            case 316546472:
                if (str.equals("REACT_NOTHEME")) {
                    c10 = '!';
                    break;
                }
                break;
            case 323643891:
                if (str.equals("REACT_GRAM_TRANSFER")) {
                    c10 = '\"';
                    break;
                }
                break;
            case 336123756:
                if (str.equals("REACT_STARGIFT_UNPACK_UPGRADE")) {
                    c10 = '#';
                    break;
                }
                break;
            case 488397309:
                if (str.equals("REACT_GIFTCODE")) {
                    c10 = '$';
                    break;
                }
                break;
            case 591941181:
                if (str.equals("REACT_STICKER")) {
                    c10 = '%';
                    break;
                }
                break;
            case 635226735:
                if (str.equals("CHAT_REACT_AUDIO")) {
                    c10 = '&';
                    break;
                }
                break;
            case 648703179:
                if (str.equals("CHAT_REACT_PHOTO")) {
                    c10 = '\'';
                    break;
                }
                break;
            case 650764327:
                if (str.equals("CHAT_REACT_ROUND")) {
                    c10 = '(';
                    break;
                }
                break;
            case 651831182:
                if (str.equals("CHAT_REACT_STORY")) {
                    c10 = ')';
                    break;
                }
                break;
            case 652387426:
                if (str.equals("CHAT_REACT_THEME")) {
                    c10 = '*';
                    break;
                }
                break;
            case 654263060:
                if (str.equals("CHAT_REACT_VIDEO")) {
                    c10 = '+';
                    break;
                }
                break;
            case 731873318:
                if (str.equals("CHAT_REACT_GIVEAWAY")) {
                    c10 = ',';
                    break;
                }
                break;
            case 858352720:
                if (str.equals("REACT_UNIQUE_STARGIFT")) {
                    c10 = '-';
                    break;
                }
                break;
            case 908725632:
                if (str.equals("REACT_STORY_MENTION")) {
                    c10 = '.';
                    break;
                }
                break;
            case 917562465:
                if (str.equals("REACT_GIVEAWAY_STARS")) {
                    c10 = '/';
                    break;
                }
                break;
            case 932558943:
                if (str.equals("REACT_GIVEAWAY")) {
                    c10 = '0';
                    break;
                }
                break;
            case 955011426:
                if (str.equals("REACT_STARGIFT")) {
                    c10 = '1';
                    break;
                }
                break;
            case 1149769750:
                if (str.equals("CHAT_REACT_GEOLIVE")) {
                    c10 = '2';
                    break;
                }
                break;
            case 1152553460:
                if (str.equals("REACT_VIDEO_SECRET")) {
                    c10 = '3';
                    break;
                }
                break;
            case 1183753176:
                if (str.equals("REACT_SUGGEST_BIRTHDAY")) {
                    c10 = '4';
                    break;
                }
                break;
            case 1191219583:
                if (str.equals("REACT_PROXIMITY")) {
                    c10 = '5';
                    break;
                }
                break;
            case 1422598001:
                if (str.equals("REACT_PAID_MEDIA")) {
                    c10 = '6';
                    break;
                }
                break;
            case 1606362326:
                if (str.equals("REACT_AUDIO")) {
                    c10 = '7';
                    break;
                }
                break;
            case 1619838770:
                if (str.equals("REACT_PHOTO")) {
                    c10 = '8';
                    break;
                }
                break;
            case 1621899918:
                if (str.equals("REACT_ROUND")) {
                    c10 = '9';
                    break;
                }
                break;
            case 1622966773:
                if (str.equals("REACT_STORY")) {
                    c10 = ':';
                    break;
                }
                break;
            case 1623523017:
                if (str.equals("REACT_THEME")) {
                    c10 = ';';
                    break;
                }
                break;
            case 1625398651:
                if (str.equals("REACT_VIDEO")) {
                    c10 = '<';
                    break;
                }
                break;
            case 1657688324:
                if (str.equals("REACT_SUGGEST_USERPIC")) {
                    c10 = '=';
                    break;
                }
                break;
            case 1664242232:
                if (str.equals("REACT_DOC")) {
                    c10 = '>';
                    break;
                }
                break;
            case 1664244817:
                if (str.equals("REACT_GEO")) {
                    c10 = '?';
                    break;
                }
                break;
            case 1664244932:
                if (str.equals("REACT_GIF")) {
                    c10 = '@';
                    break;
                }
                break;
            case 1683218969:
                if (str.equals("CHAT_REACT_GAME")) {
                    c10 = 'A';
                    break;
                }
                break;
            case 1683500518:
                if (str.equals("CHAT_REACT_POLL")) {
                    c10 = 'B';
                    break;
                }
                break;
            case 1683535996:
                if (str.equals("CHAT_REACT_QUIZ")) {
                    c10 = 'C';
                    break;
                }
                break;
            case 1683610452:
                if (str.equals("CHAT_REACT_TEXT")) {
                    c10 = 'D';
                    break;
                }
                break;
            case 1683619437:
                if (str.equals("CHAT_REACT_TODO")) {
                    c10 = 'E';
                    break;
                }
                break;
            case 1876172076:
                if (str.equals("CHAT_REACT_TODO_APPEND")) {
                    c10 = 'F';
                    break;
                }
                break;
            case 1907150419:
                if (str.equals("REACT_TODO_APPEND")) {
                    c10 = 'G';
                    break;
                }
                break;
            case 2004734138:
                if (str.equals("REACT_GIFT_THEME")) {
                    c10 = 'H';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return cd.a0(null, null, 2131746589, objArr);
            case 1:
                return cd.a0(null, null, 2131746526, objArr);
            case 2:
                return cd.a0(null, null, 2131746578, objArr);
            case 3:
                return cd.a0(null, null, 2131746562, objArr);
            case 4:
                return cd.a0(null, null, 2131746564, objArr);
            case 5:
                return cd.a0(null, null, 2131746538, objArr);
            case 6:
            case 'F':
                return cd.a0(null, null, 2131746570, objArr);
            case 7:
                return cd.a0(null, null, 2131746548, objArr);
            case '\b':
                return cd.a0(null, null, 2131746541, objArr);
            case '\t':
                return cd.a0(null, null, 2131746557, objArr);
            case '\n':
                return cd.a0(null, null, 2131746581, objArr);
            case 11:
                return cd.a0(null, null, 2131746586, objArr);
            case '\f':
                return cd.a0(null, null, 2131746555, objArr);
            case '\r':
                return cd.a0(null, null, 2131746552, objArr);
            case 14:
                return cd.a0(null, null, 2131746525, objArr);
            case 15:
                return cd.a0(null, null, 2131746582, objArr);
            case 16:
            case '*':
                return cd.a0(null, null, 2131746572, objArr);
            case 17:
                return cd.a0(null, null, 2131746567, objArr);
            case 18:
                return cd.a0(null, null, 2131746543, objArr);
            case 19:
                return cd.a0(null, null, 2131746575, objArr);
            case 20:
                return cd.a0(null, null, 2131746546, objArr);
            case 21:
                return cd.a0(null, null, 2131746558, objArr);
            case 22:
                return cd.a0(null, null, 2131746565, objArr);
            case 23:
                return cd.a0(null, null, 2131746551, objArr);
            case 24:
                return cd.a0(null, null, 2131746549, objArr);
            case 25:
                return cd.a0(null, null, 2131746533, objArr);
            case 26:
                return cd.a0(null, null, 2131746531, objArr);
            case 27:
                return cd.a0(null, null, 2131746556, objArr);
            case 28:
                return cd.a0(null, null, 2131746545, objArr);
            case 29:
                return cd.a0(null, null, 2131746588, objArr);
            case 30:
                return cd.a0(null, null, 2131746585, objArr);
            case 31:
                return cd.a0(null, null, 2131746583, objArr);
            case ' ':
            case 'G':
                return cd.a0(null, null, 2131746530, objArr);
            case '!':
            case ';':
            case 'H':
                return cd.a0(null, null, 2131746532, objArr);
            case '\"':
                return cd.a0(null, null, 2131746559, objArr);
            case '#':
                return cd.a0(null, null, 2131746542, objArr);
            case '$':
                return cd.a0(null, null, 2131746560, objArr);
            case '%':
                return cd.a0(null, null, 2131746540, objArr);
            case '&':
                return cd.a0(null, null, 2131746590, objArr);
            case '\'':
                return cd.a0(null, null, 2131746580, objArr);
            case '(':
                return cd.a0(null, null, 2131746576, objArr);
            case ')':
                return cd.a0(null, null, 2131746574, objArr);
            case '+':
                return cd.a0(null, null, 2131746569, objArr);
            case ',':
                return cd.a0(null, null, 2131748064, objArr);
            case '-':
                return cd.a0(null, null, 2131746529, objArr);
            case '.':
                return cd.a0(null, null, 2131746536, objArr);
            case '/':
                return cd.a0(null, null, 2131747953, objArr);
            case '0':
                return cd.a0(null, null, 2131747953, objArr);
            case '1':
                return cd.a0(null, null, 2131746544, objArr);
            case '2':
                return cd.a0(null, null, 2131746584, objArr);
            case '3':
                return cd.a0(null, null, 2131746527, objArr);
            case '4':
                return cd.a0(null, null, 2131746535, objArr);
            case '5':
                return cd.a0(null, null, 2131746550, objArr);
            case '6':
                return cd.a0(null, null, 2131746554, objArr);
            case '7':
                return cd.a0(null, null, 2131746568, objArr);
            case '8':
                return cd.a0(null, null, 2131746553, objArr);
            case '9':
                return cd.a0(null, null, 2131746547, objArr);
            case ':':
                return cd.a0(null, null, 2131746539, objArr);
            case '<':
                return cd.a0(null, null, 2131746528, objArr);
            case '=':
                return cd.a0(null, null, 2131746534, objArr);
            case '>':
                return cd.a0(null, null, 2131746566, objArr);
            case '?':
                return cd.a0(null, null, 2131746563, objArr);
            case '@':
                return cd.a0(null, null, 2131746561, objArr);
            case 'A':
                return cd.a0(null, null, 2131746587, objArr);
            case 'B':
                return cd.a0(null, null, 2131746579, objArr);
            case 'C':
                return cd.a0(null, null, 2131746577, objArr);
            case 'D':
                return cd.a0(null, null, 2131746573, objArr);
            case 'E':
                return cd.a0(null, null, 2131746571, objArr);
            default:
                return null;
        }
    }

    public static void lambda$processRemoteMessage$2(int i10, TLRPC.TL_updates tL_updates) {
        vp.r1(i10).L3(tL_updates, false);
    }

    public static void lambda$processRemoteMessage$3(int i10) {
        if (d20.i(i10).e() != 0) {
            d20.i(i10).b();
            vp.r1(i10).x3(0);
        }
    }

    public static void lambda$processRemoteMessage$4(int i10) {
        nd f7 = nd.f(i10);
        if (f7.f17083b.isEmpty()) {
            return;
        }
        f7.H = SystemClock.elapsedRealtime() + 65000;
        f7.p();
    }

    public static void lambda$processRemoteMessage$5(int i10, long j10, int i11) {
        vp.r1(i10).k4(i11, j10, true);
    }

    public static void lambda$processRemoteMessage$6(java.lang.String r86, java.lang.String r87, long r88) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.PushListenerController.lambda$processRemoteMessage$6(java.lang.String, java.lang.String, long):void");
    }

    public static void lambda$processRemoteMessage$7(String str, String str2, long j10) {
        if (v2.f18448a) {
            f8.b(str + " PRE INIT APP");
        }
        w0.w();
        if (v2.f18448a) {
            f8.b(str + " POST INIT APP");
        }
        Utilities.d.c(new du(0, j10, str, str2));
    }

    public static void lambda$sendRegistrationToServer$0(int i10, int i11, String str) {
        vp.r1(i10).W3(i11, str);
    }

    public static void lambda$sendRegistrationToServer$1(String str, int i10) {
        boolean z10;
        String str2;
        ConnectionsManager.setRegId(str, i10, tz.h);
        if (str != null) {
            if (tz.f18152i != 0 && tz.f18155j != 0 && (!tz.f18158k || !TextUtils.equals(tz.f18147g, str))) {
                tz.f18158k = false;
                z10 = true;
            } else {
                z10 = false;
            }
            tz.f18147g = str;
            tz.f18144f = i10;
            for (int i11 = 0; i11 < 4; i11++) {
                d20 i12 = d20.i(i11);
                i12.d = false;
                i12.v(false);
                if (i12.e() != 0) {
                    if (z10) {
                        if (i10 == 2) {
                            str2 = "fcm";
                        } else {
                            str2 = "hcm";
                        }
                        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
                        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
                        tL_inputAppEvent.time = tz.f18152i;
                        tL_inputAppEvent.type = str2.concat("_token_request");
                        tL_inputAppEvent.peer = 0L;
                        tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
                        tL_help_saveAppLog.events.add(tL_inputAppEvent);
                        TLRPC.TL_inputAppEvent tL_inputAppEvent2 = new TLRPC.TL_inputAppEvent();
                        tL_inputAppEvent2.time = tz.f18155j;
                        tL_inputAppEvent2.type = str2.concat("_token_response");
                        tL_inputAppEvent2.peer = tz.f18155j - tz.f18152i;
                        tL_inputAppEvent2.data = new TLRPC.TL_jsonNull();
                        tL_help_saveAppLog.events.add(tL_inputAppEvent2);
                        tz.f18158k = true;
                        tz.y();
                        ConnectionsManager.getInstance(i11).sendRequest(tL_help_saveAppLog, null);
                        z10 = false;
                    }
                    i0.g3(new i2.u(i11, i10, str, 4));
                }
            }
        }
    }

    private static void onDecryptError() {
        for (int i10 = 0; i10 < 4; i10++) {
            if (d20.i(i10).p()) {
                ConnectionsManager.onInternalPushReceived(i10);
                ConnectionsManager.getInstance(i10).resumeNetworkMaybe();
            }
        }
        countDownLatch.countDown();
    }

    public static void processRemoteMessage(int i10, String str, long j10) {
        String str2;
        if (i10 == 2) {
            str2 = "FCM";
        } else {
            str2 = "HCM";
        }
        String str3 = str2;
        if (v2.f18448a) {
            f8.b(str3.concat(" PRE START PROCESSING"));
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        i0.g3(new du(1, j10, str3, str));
        try {
            countDownLatch.await();
        } catch (Throwable unused) {
        }
        boolean z10 = v2.f18448a;
        StringBuilder u10 = a1.g.u("finished ", str3, " service, time = ");
        u10.append(SystemClock.elapsedRealtime() - elapsedRealtime);
        f8.b(u10.toString());
    }

    public static void sendRegistrationToServer(int i10, String str) {
        Utilities.d.c(new a1(str, i10, 10));
    }
}
