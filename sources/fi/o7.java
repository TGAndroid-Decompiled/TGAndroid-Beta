package fi;

import a8.pf;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.m20;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.u61;
public final class o7 extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener, oe.d {
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public TLRPC.User D0;
    public boolean E0;
    public boolean F0;
    public int G0;
    public String H0;
    public int I0;
    public final i7 J0;
    public boolean K0;
    public final oe.b X;
    public final int Y;
    public boolean Z;
    public final o7 f11395a0;
    public final ArrayList f11396b0;
    public final ArrayList f11397c0;
    public final ArrayList f11398d0;
    public final MessagesController.SavedMusicList f11399e0;
    public final Utilities.Callback f11400f0;
    public MessageObject f11401g0;
    public boolean f11402h0;
    public boolean f11403i0;
    public final FrameLayout f11404j0;
    public final si f11405k0;
    public final ch.f f11406l0;
    public final hh.c m0;
    public final ch.b f11407n0;
    public final k7 f11408o0;
    public k71 f11409p0;
    public MessageObject f11410q0;
    public String f11411r0;
    public int f11412s0;
    public boolean f11413t0;
    public boolean f11414u0;
    public boolean f11415v0;
    public String f11416w0;
    public int f11417x0;
    public final i7 f11418y0;
    public String f11419z0;

    public o7(Context context, boolean z10, o7 o7Var, Utilities.Callback callback, org.telegram.ui.ActionBar.u6 u6Var) {
        super(2, context, u6Var, true);
        int dp;
        ds dsVar = ds.h;
        this.X = new oe.b(0, this, dsVar, 380L, false);
        this.f11396b0 = new ArrayList();
        this.f11397c0 = new ArrayList();
        this.f11398d0 = new ArrayList();
        this.f11417x0 = -1;
        this.f11418y0 = new Runnable(this) {
            public final o7 f11004b;

            {
                this.f11004b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        o7.S(this.f11004b);
                        return;
                    case 1:
                        this.f11004b.b0();
                        return;
                    default:
                        this.f11004b.a0();
                        return;
                }
            }
        };
        this.G0 = -1;
        this.I0 = -2000000000;
        this.J0 = new Runnable(this) {
            public final o7 f11004b;

            {
                this.f11004b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        o7.S(this.f11004b);
                        return;
                    case 1:
                        this.f11004b.b0();
                        return;
                    default:
                        this.f11004b.a0();
                        return;
                }
            }
        };
        this.v = 0.35f;
        fixNavigationBar();
        K();
        this.I = AndroidUtilities.dp(4.0f);
        this.J = AndroidUtilities.dp(-20.0f);
        this.Z = z10;
        this.Y = DownloadController.getInstance(this.currentAccount).generateObserverTag();
        this.f11395a0 = o7Var;
        this.f11400f0 = callback;
        hh.c d = this.glassEngine.d(new j7(this));
        this.m0 = d;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            ch.f fVar = new ch.f();
            this.f11406l0 = fVar;
            this.glassEngine.a(fVar);
            hh.d dVar = new hh.d(d);
            dVar.f12840f = d;
            dVar.d = fVar;
            dVar.e = -2;
            ch.b bVar = new ch.b(dVar);
            this.f11407n0 = bVar;
            bVar.f6303i = LiteMode.isEnabled(262144);
            if (LiteMode.isEnabled(262144)) {
                dp = AndroidUtilities.dp(8.0f);
            } else {
                dp = AndroidUtilities.dp(48.0f);
            }
            bVar.f6299b = dp;
            bVar.f6300c = dp;
            bVar.h = this.glassEngine;
        } else {
            this.f11406l0 = null;
            this.f11407n0 = new ch.b(d);
        }
        this.f11408o0 = new dh.a() {
            @Override
            public final void b(ch.a aVar, RectF rectF) {
                aVar.f6296a = true;
            }

            @Override
            public final void f(Canvas canvas, RectF rectF) {
                o7 o7Var2 = o7.this;
                nm0 nm0Var = o7Var2.d;
                ih.d.b(nm0Var, canvas, rectF, nm0Var, o7Var2.getContainerView(), 255);
            }
        };
        int i10 = org.telegram.ui.ActionBar.y6.f23300a7;
        si siVar = new si(context, i10, u6Var);
        this.f11405k0 = siVar;
        siVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f11404j0 = frameLayout;
        m20 m20Var = new m20(context, u6Var);
        m20Var.f30347r.setOnFocusChangeListener(new l7(this));
        m20Var.f30349w = true;
        m20Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        m20Var.updateColors();
        m20Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        m20Var.f30347r.addTextChangedListener(new m7(this));
        m20Var.f30347r.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(siVar, kb1.k());
        frameLayout.addView(m20Var, kb1.h(-1, 48.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f));
        m20Var.setupBlurredBackground(this.f11407n0.c(m20Var, gh.c.o(u6Var), false));
        frameLayout.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.containerView.addView(frameLayout, kb1.i(-1, -2, 55));
        setBackgroundColorKey(i10);
        nm0 nm0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        nm0Var.setPadding(i11, 0, i11, 0);
        this.d.u1();
        s4.l lVar = new s4.l();
        lVar.f47798m = false;
        lVar.C = false;
        lVar.o(dsVar);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        if (!z10) {
            int i12 = this.currentAccount;
            MessagesController.SavedMusicList savedMusicList = new MessagesController.SavedMusicList(i12, UserConfig.getInstance(i12).getClientUserId());
            this.f11399e0 = savedMusicList;
            savedMusicList.load();
            b0();
            a0();
        } else {
            this.f11399e0 = null;
            if (this.Z && !this.K0) {
                this.K0 = true;
                Utilities.globalQueue.postRunnable(new Runnable(this) {
                    public final o7 f11004b;

                    {
                        this.f11004b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                o7.S(this.f11004b);
                                return;
                            case 1:
                                this.f11004b.b0();
                                return;
                            default:
                                this.f11004b.a0();
                                return;
                        }
                    }
                });
            }
        }
        this.d.setOnScrollListener(new n7(this));
        this.d.setOnItemClickListener(new di.g0(this, callback, u6Var, 1));
        this.glassEngine.b(this.d);
        this.glassEngine.i(this.containerView);
        oi.q qVar = this.glassEngine;
        qVar.f19481a = new j7(this);
        qVar.d = new qi.b(AndroidUtilities.dp(48.0f));
    }

    public static void P(o7 o7Var, Long l4) {
        TLRPC.User user;
        boolean z10 = false;
        o7Var.E0 = false;
        if (l4 == null) {
            user = null;
        } else {
            user = MessagesController.getInstance(o7Var.currentAccount).getUser(l4);
        }
        o7Var.D0 = user;
        if (user == null) {
            z10 = true;
        }
        o7Var.F0 = z10;
        if (user != null) {
            o7Var.a0();
        }
    }

    public static void Q(o7 o7Var, Utilities.Callback callback, org.telegram.ui.ActionBar.u6 u6Var, View view, int i10) {
        if (view instanceof org.telegram.ui.Cells.n7) {
            MessageObject message = ((org.telegram.ui.Cells.n7) view).getMessage();
            if (message != null) {
                DownloadController.getInstance(o7Var.currentAccount).removeLoadingFileObserver(o7Var);
                if (o7Var.f11401g0 != null) {
                    FileLoader.getInstance(o7Var.currentAccount).cancelLoadFile(o7Var.f11401g0.getDocument());
                    o7Var.f11401g0 = null;
                }
                if (!message.attachPathExists && !message.mediaExists) {
                    String fileName = message.getFileName();
                    if (!TextUtils.isEmpty(fileName)) {
                        o7Var.f11401g0 = message;
                        DownloadController.getInstance(o7Var.currentAccount).addLoadingFileObserver(fileName, message, o7Var);
                        FileLoader.getInstance(o7Var.currentAccount).loadFile(message.getDocument(), message, 1, 0);
                        return;
                    }
                    return;
                }
                o7Var.f11400f0.run(message);
                o7 o7Var2 = o7Var.f11395a0;
                if (o7Var2 != null) {
                    o7Var2.dismiss();
                }
                o7Var.dismiss();
                return;
            }
            return;
        }
        u61 G = o7Var.f11409p0.G(i10 - 1);
        if (G != null && G.d == 1) {
            new o7(o7Var.getContext(), true, o7Var, callback, u6Var).show();
        } else if (G != null && G.d == 2) {
            o7Var.f11399e0.load();
        } else if (G != null && G.d == 3) {
            o7Var.b0();
        } else if (G != null && G.d == 4) {
            o7Var.a0();
        }
    }

    public static void R(o7 o7Var, TLRPC.messages_BotResults messages_botresults) {
        ArrayList arrayList = o7Var.f11398d0;
        boolean z10 = false;
        o7Var.B0 = false;
        o7Var.C0 = false;
        if (messages_botresults != null) {
            MessagesController.getInstance(o7Var.currentAccount).putUsers(messages_botresults.users, false);
            ArrayList<TLRPC.BotInlineResult> arrayList2 = messages_botresults.results;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.BotInlineResult botInlineResult = arrayList2.get(i10);
                i10++;
                TLRPC.BotInlineResult botInlineResult2 = botInlineResult;
                if (botInlineResult2 instanceof TLRPC.TL_botInlineMediaResult) {
                    TLRPC.TL_botInlineMediaResult tL_botInlineMediaResult = (TLRPC.TL_botInlineMediaResult) botInlineResult2;
                    if (tL_botInlineMediaResult.document != null) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        tL_message.out = true;
                        int i11 = o7Var.I0;
                        o7Var.I0 = i11 - 1;
                        tL_message.f22049id = i11;
                        tL_message.peer_id = new TLRPC.TL_peerUser();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_message.from_id = tL_peerUser;
                        TLRPC.Peer peer = tL_message.peer_id;
                        long clientUserId = UserConfig.getInstance(o7Var.currentAccount).getClientUserId();
                        tL_peerUser.user_id = clientUserId;
                        peer.user_id = clientUserId;
                        tL_message.date = (int) (System.currentTimeMillis() / 1000);
                        tL_message.message = "";
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                        tL_message.media = tL_messageMediaDocument;
                        tL_messageMediaDocument.flags |= 3;
                        tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                        tL_message.flags |= 768;
                        arrayList.add(new MessageObject(o7Var.currentAccount, tL_message, false, true));
                    }
                }
            }
            o7Var.f11419z0 = messages_botresults.next_offset;
            if (!arrayList.isEmpty() && !TextUtils.isEmpty(o7Var.f11419z0)) {
                z10 = true;
            }
            o7Var.A0 = z10;
            o7Var.f11409p0.O(true);
            return;
        }
        o7Var.f11409p0.O(true);
    }

    public static void S(o7 o7Var) {
        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
        ArrayList arrayList = new ArrayList();
        try {
            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
            int i10 = -2000000000;
            while (query.moveToNext()) {
                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                audioEntry.f19541id = query.getInt(0);
                audioEntry.author = query.getString(1);
                audioEntry.title = query.getString(2);
                audioEntry.path = query.getString(3);
                audioEntry.duration = (int) (query.getLong(4) / 1000);
                audioEntry.genre = query.getString(5);
                File file = new File(audioEntry.path);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                tL_message.f22049id = i10;
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                long clientUserId = UserConfig.getInstance(o7Var.currentAccount).getClientUserId();
                tL_peerUser.user_id = clientUserId;
                peer.user_id = clientUserId;
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                tL_message.message = "";
                tL_message.attachPath = audioEntry.path;
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = new TLRPC.TL_document();
                tL_message.flags |= 768;
                String fileExtension = FileLoader.getFileExtension(file);
                TLRPC.Document document = tL_message.media.document;
                document.f22034id = 0L;
                document.access_hash = 0L;
                document.file_reference = new byte[0];
                document.date = tL_message.date;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("audio/");
                if (fileExtension.length() <= 0) {
                    fileExtension = "mp3";
                }
                sb2.append(fileExtension);
                document.mime_type = sb2.toString();
                tL_message.media.document.size = (int) file.length();
                tL_message.media.document.dc_id = 0;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                tL_documentAttributeAudio.duration = audioEntry.duration;
                tL_documentAttributeAudio.title = audioEntry.title;
                tL_documentAttributeAudio.performer = audioEntry.author;
                tL_documentAttributeAudio.flags = 3 | tL_documentAttributeAudio.flags;
                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                tL_documentAttributeFilename.file_name = file.getName();
                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                MessageObject messageObject = new MessageObject(o7Var.currentAccount, tL_message, false, true);
                audioEntry.messageObject = messageObject;
                arrayList.add(messageObject);
                i10--;
            }
            query.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new e2.q0(16, o7Var, arrayList));
    }

    public static void T(o7 o7Var, TLObject tLObject) {
        ArrayList arrayList = o7Var.f11397c0;
        boolean z10 = false;
        o7Var.f11415v0 = false;
        o7Var.f11414u0 = false;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(o7Var.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(o7Var.currentAccount).putChats(messages_messages.chats, false);
            ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.Message message = arrayList2.get(i10);
                i10++;
                arrayList.add(new MessageObject(o7Var.currentAccount, message, false, true));
            }
            if ((messages_messages instanceof TLRPC.TL_messages_messagesSlice) && arrayList.size() < messages_messages.count) {
                z10 = true;
            }
            o7Var.f11413t0 = z10;
            o7Var.f11412s0 = messages_messages.next_rate;
        } else {
            o7Var.f11413t0 = false;
            o7Var.f11412s0 = 0;
        }
        o7Var.f11409p0.O(true);
    }

    public static void U(o7 o7Var, int i10) {
        ch.f fVar = o7Var.f11406l0;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            if (pf.a(i10, 4)) {
                fVar.h(o7Var.glassEngine.e());
            }
            fVar.e(o7Var.f11408o0, o7Var.containerView.getWidth(), o7Var.containerView.getHeight());
        }
    }

    public static boolean c0(String str, String str2, String str3) {
        if (str3 != null) {
            String lowerCase = str3.toLowerCase();
            if (!lowerCase.startsWith(str) && !wh.u(" ", str, lowerCase)) {
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                if (!translitSafe.startsWith(str2) && !wh.u(" ", str2, translitSafe)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        int i11;
        if (i10 == 0) {
            si siVar = this.f11405k0;
            siVar.setAlpha(f7);
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            siVar.setVisibility(i11);
        }
    }

    @Override
    public final void I(Canvas canvas, View view) {
        d0();
        super.I(canvas, view);
    }

    public final int X(boolean z10, ArrayList arrayList, String str, ArrayList arrayList2, boolean z11, boolean z12, int i10) {
        String lowerCase;
        int i11;
        int i12 = 0;
        if (arrayList2 != null && (!arrayList2.isEmpty() || z11)) {
            ArrayList arrayList3 = new ArrayList();
            String str2 = this.f11411r0;
            if (str2 == null) {
                lowerCase = null;
            } else {
                lowerCase = str2.toLowerCase();
            }
            String translitSafe = AndroidUtilities.translitSafe(lowerCase);
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList2.get(i13);
                i13++;
                MessageObject messageObject = (MessageObject) obj;
                if (!z10) {
                    messageObject.setQuery(this.f11411r0);
                    arrayList3.add(messageObject);
                } else if (!TextUtils.isEmpty(lowerCase) && arrayList2 != this.f11397c0) {
                    String musicTitle = messageObject.getMusicTitle();
                    String musicAuthor = messageObject.getMusicAuthor();
                    if (c0(lowerCase, translitSafe, musicTitle) || c0(lowerCase, translitSafe, musicAuthor)) {
                        messageObject.setQuery(this.f11411r0);
                        arrayList3.add(messageObject);
                    }
                } else {
                    messageObject.setQuery(null);
                    arrayList3.add(messageObject);
                }
            }
            if (!arrayList3.isEmpty() || z11) {
                if (!arrayList.isEmpty() && arrayList.size() > 1) {
                    arrayList.add(u61.C(null));
                    i11 = AndroidUtilities.dp(12.0f);
                } else {
                    i11 = 0;
                }
                this.f11409p0.V();
                arrayList.add(u61.u(str));
                int size2 = arrayList3.size();
                while (i12 < size2) {
                    Object obj2 = arrayList3.get(i12);
                    i12++;
                    bi.dc dcVar = new bi.dc(this, 1);
                    int i14 = org.telegram.ui.Cells.m7.f24486a;
                    u61 K = u61.K(org.telegram.ui.Cells.m7.class);
                    K.G = (MessageObject) obj2;
                    K.H = dcVar;
                    arrayList.add(K);
                    i11 += AndroidUtilities.dp(56.0f);
                }
                if (z11) {
                    arrayList.add(u61.p(4));
                    arrayList.add(u61.p(4));
                    arrayList.add(u61.p(4));
                    i11 += AndroidUtilities.dp(56.0f) * 3;
                }
                if (z12 && !z11) {
                    u61 c10 = u61.c(i10, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                    c10.f33254q = true;
                    arrayList.add(c10);
                    i11 += AndroidUtilities.dp(50.0f);
                }
                this.f11409p0.U();
                return i11;
            }
        }
        return 0;
    }

    public final void Y() {
        if (this.G0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.G0, true);
        }
        this.G0 = -1;
        this.f11419z0 = "";
        this.A0 = false;
        this.f11398d0.clear();
        this.B0 = false;
        this.C0 = false;
    }

    public final void Z() {
        if (this.f11417x0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f11417x0, true);
        }
        this.f11417x0 = -1;
        this.f11412s0 = 0;
        this.f11397c0.clear();
        this.f11414u0 = false;
        this.f11415v0 = false;
    }

    public final void a0() {
        String str = MessagesController.getInstance(this.currentAccount).config.musicSearchUsername.get();
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.H0;
            String str3 = this.f11411r0;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            if (!TextUtils.equals(str2, str3)) {
                Y();
            }
            if (!this.B0 && !TextUtils.isEmpty(this.f11411r0) && this.f11411r0.length() >= 3) {
                ArrayList arrayList = this.f11398d0;
                if (arrayList.isEmpty() || this.A0) {
                    if (this.D0 == null) {
                        this.D0 = MessagesController.getInstance(this.currentAccount).getUser(str);
                    }
                    if (this.D0 == null) {
                        if (!this.E0 && !this.F0) {
                            this.E0 = true;
                            MessagesController.getInstance(this.currentAccount).getUserNameResolver().resolve(str, new ai.i(this, 24));
                            return;
                        }
                        return;
                    }
                    this.B0 = true;
                    TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
                    TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                    tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.D0);
                    tL_messages_getInlineBotResults.peer = MessagesController.getInputPeer(currentUser);
                    tL_messages_getInlineBotResults.offset = (arrayList.isEmpty() || (r0 = this.f11419z0) == null) ? "" : "";
                    String str5 = this.f11411r0;
                    if (str5 != null) {
                        str4 = str5;
                    }
                    this.H0 = str4;
                    tL_messages_getInlineBotResults.query = str4;
                    this.G0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_getInlineBotResults, new Object(), new h7(this, 1));
                    this.f11409p0.O(true);
                }
            }
        }
    }

    public final void b0() {
        if (!this.Z) {
            String str = this.f11416w0;
            String str2 = this.f11411r0;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            if (!TextUtils.equals(str, str2)) {
                Z();
            }
            if (!this.f11414u0) {
                ArrayList arrayList = this.f11397c0;
                if (!arrayList.isEmpty() && !this.f11413t0) {
                    return;
                }
                this.f11414u0 = true;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
                String str4 = this.f11411r0;
                if (str4 != null) {
                    str3 = str4;
                }
                this.f11416w0 = str3;
                tL_messages_searchGlobal.f22141q = str3;
                tL_messages_searchGlobal.limit = 20;
                if (arrayList.size() > 0) {
                    MessageObject messageObject = (MessageObject) ic.a.g(1, arrayList);
                    tL_messages_searchGlobal.offset_id = messageObject.getId();
                    tL_messages_searchGlobal.offset_rate = this.f11412s0;
                    tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
                } else {
                    tL_messages_searchGlobal.offset_rate = 0;
                    tL_messages_searchGlobal.offset_id = 0;
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                this.f11417x0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_searchGlobal, new bi.i0(this, 9));
                this.f11409p0.O(true);
            }
        }
    }

    public final void d0() {
        float f7 = AndroidUtilities.displaySize.y;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            nm0 nm0Var = this.d;
            if (i10 >= nm0Var.getChildCount()) {
                break;
            }
            View childAt = nm0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f7) {
                f7 = childAt.getY();
            }
            i10++;
        }
        this.f11404j0.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, f7));
        if (f7 <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) {
            z10 = true;
        }
        this.X.a(z10, true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.musicListLoaded) {
            this.f11409p0.O(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f11410q0 != null && MediaController.getInstance().isPlayingMessage(this.f11410q0)) {
            MediaController.getInstance().cleanupPlayer(true, true);
        }
        this.f11410q0 = null;
    }

    @Override
    public final int getObserverTag() {
        return this.Y;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.musicListLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.musicListLoaded);
    }

    @Override
    public final void onSuccessDownload(String str) {
        MessageObject messageObject = this.f11401g0;
        if (messageObject != null && TextUtils.equals(messageObject.getFileName(), str)) {
            this.f11400f0.run(this.f11401g0);
            o7 o7Var = this.f11395a0;
            if (o7Var != null) {
                o7Var.dismiss();
            }
            dismiss();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            hh.c cVar = this.m0;
            if (cVar != null) {
                cVar.a(getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final mm0 v(nm0 nm0Var) {
        k71 k71Var = new k71(nm0Var, getContext(), this.currentAccount, 0, false, new h7(this, 0), this.resourcesProvider);
        this.f11409p0 = k71Var;
        k71Var.f29878r = false;
        return k71Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoryMusicTitle2);
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
    }

    @Override
    public final void z(float f7, int i10) {
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
