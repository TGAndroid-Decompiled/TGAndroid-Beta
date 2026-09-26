package ci;

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
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d20;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xl0;
public final class d8 extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener, le.e {
    public String A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public TLRPC.User E0;
    public boolean F0;
    public boolean G0;
    public int H0;
    public String I0;
    public int J0;
    public final v7 K0;
    public boolean L0;
    public final ArrayList M0;
    public final RectF N0;
    public final ArrayList O0;
    public final le.c X;
    public final int Y;
    public boolean Z;
    public final d8 f4520a0;
    public final ArrayList f4521b0;
    public final ArrayList f4522c0;
    public final ArrayList f4523d0;
    public final MessagesController.SavedMusicList f4524e0;
    public final Utilities.Callback f4525f0;
    public MessageObject f4526g0;
    public boolean f4527h0;
    public boolean f4528i0;
    public final FrameLayout f4529j0;
    public final vi f4530k0;
    public final ah.h f4531l0;
    public final fh.d m0;
    public final fh.d f4532n0;
    public final ah.c f4533o0;
    public final w7 f4534p0;
    public k61 f4535q0;
    public MessageObject f4536r0;
    public String f4537s0;
    public int f4538t0;
    public boolean f4539u0;
    public boolean f4540v0;
    public boolean f4541w0;
    public String f4542x0;
    public int f4543y0;
    public final v7 f4544z0;

    public d8(Context context, boolean z10, d8 d8Var, Utilities.Callback callback, org.telegram.ui.ActionBar.d6 d6Var) {
        super(2, context, d6Var, true);
        sr srVar = sr.h;
        this.X = new le.c(0, this, srVar, 380L, false);
        this.f4521b0 = new ArrayList();
        this.f4522c0 = new ArrayList();
        this.f4523d0 = new ArrayList();
        this.f4543y0 = -1;
        this.f4544z0 = new Runnable(this) {
            public final d8 f5677b;

            {
                this.f5677b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f5677b.b0();
                        return;
                    case 1:
                        this.f5677b.a0();
                        return;
                    default:
                        d8.T(this.f5677b);
                        return;
                }
            }
        };
        this.H0 = -1;
        this.J0 = -2000000000;
        this.K0 = new Runnable(this) {
            public final d8 f5677b;

            {
                this.f5677b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f5677b.b0();
                        return;
                    case 1:
                        this.f5677b.a0();
                        return;
                    default:
                        d8.T(this.f5677b);
                        return;
                }
            }
        };
        ArrayList arrayList = new ArrayList();
        this.M0 = arrayList;
        RectF rectF = new RectF();
        this.N0 = rectF;
        arrayList.add(rectF);
        this.O0 = new ArrayList();
        this.v = 0.35f;
        fixNavigationBar();
        K();
        this.I = AndroidUtilities.dp(4.0f);
        this.J = AndroidUtilities.dp(-20.0f);
        this.Z = z10;
        this.Y = DownloadController.getInstance(this.currentAccount).generateObserverTag();
        this.f4520a0 = d8Var;
        this.f4525f0 = callback;
        fh.c cVar = new fh.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.h6.f19059d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f4531l0 = new ah.h(false);
            fh.d dVar = new fh.d(null);
            this.f4532n0 = dVar;
            dVar.k(new y7(this));
            fh.d dVar2 = new fh.d(null);
            this.m0 = dVar2;
            dVar2.k(new z7(this));
            ah.c cVar2 = new ah.c(dVar);
            this.f4533o0 = cVar2;
            cVar2.f427i = LiteMode.isEnabled(262144);
            LiteMode.isEnabled(262144);
        } else {
            this.f4531l0 = null;
            this.m0 = null;
            this.f4532n0 = null;
            this.f4533o0 = new ah.c(cVar);
        }
        this.f4534p0 = new w7(this, 0);
        int i10 = org.telegram.ui.ActionBar.h6.f19003a7;
        vi viVar = new vi(context, i10, d6Var);
        this.f4530k0 = viVar;
        viVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f4529j0 = frameLayout;
        d20 d20Var = new d20(context, d6Var);
        d20Var.f23475r.setOnFocusChangeListener(new a8(this));
        d20Var.f23477w = true;
        d20Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        d20Var.e();
        d20Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        d20Var.f23475r.addTextChangedListener(new b8(this));
        d20Var.f23475r.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(viVar, w7.y5.g());
        frameLayout.addView(d20Var, w7.y5.d(-1, 48.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f));
        d20Var.setupBlurredBackground(this.f4533o0.c(d20Var, eh.b.n(d6Var), false));
        frameLayout.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.containerView.addView(frameLayout, w7.y5.e(-1, -2, 55));
        setBackgroundColor(getThemedColor(i10));
        xl0 xl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        xl0Var.setPadding(i11, 0, i11, 0);
        this.d.p1();
        s4.j jVar = new s4.j();
        jVar.f42994m = false;
        jVar.C = false;
        jVar.o(srVar);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        if (!z10) {
            int i12 = this.currentAccount;
            MessagesController.SavedMusicList savedMusicList = new MessagesController.SavedMusicList(i12, UserConfig.getInstance(i12).getClientUserId());
            this.f4524e0 = savedMusicList;
            savedMusicList.load();
            b0();
            a0();
        } else {
            this.f4524e0 = null;
            if (this.Z && !this.L0) {
                this.L0 = true;
                Utilities.globalQueue.postRunnable(new Runnable(this) {
                    public final d8 f5677b;

                    {
                        this.f5677b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f5677b.b0();
                                return;
                            case 1:
                                this.f5677b.a0();
                                return;
                            default:
                                d8.T(this.f5677b);
                                return;
                        }
                    }
                });
            }
        }
        this.d.setOnScrollListener(new c8(this));
        this.d.setOnItemClickListener(new ai.u0(this, callback, d6Var, 1));
    }

    public static void P(d8 d8Var, TLRPC.messages_BotResults messages_botresults) {
        ArrayList arrayList = d8Var.f4523d0;
        boolean z10 = false;
        d8Var.C0 = false;
        d8Var.D0 = false;
        if (messages_botresults != null) {
            MessagesController.getInstance(d8Var.currentAccount).putUsers(messages_botresults.users, false);
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
                        int i11 = d8Var.J0;
                        d8Var.J0 = i11 - 1;
                        tL_message.f18356id = i11;
                        tL_message.peer_id = new TLRPC.TL_peerUser();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_message.from_id = tL_peerUser;
                        TLRPC.Peer peer = tL_message.peer_id;
                        long clientUserId = UserConfig.getInstance(d8Var.currentAccount).getClientUserId();
                        tL_peerUser.user_id = clientUserId;
                        peer.user_id = clientUserId;
                        tL_message.date = (int) (System.currentTimeMillis() / 1000);
                        tL_message.message = "";
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                        tL_message.media = tL_messageMediaDocument;
                        tL_messageMediaDocument.flags |= 3;
                        tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                        tL_message.flags |= 768;
                        arrayList.add(new MessageObject(d8Var.currentAccount, tL_message, false, true));
                    }
                }
            }
            d8Var.A0 = messages_botresults.next_offset;
            if (!arrayList.isEmpty() && !TextUtils.isEmpty(d8Var.A0)) {
                z10 = true;
            }
            d8Var.B0 = z10;
            d8Var.f4535q0.N(true);
            return;
        }
        d8Var.f4535q0.N(true);
    }

    public static void Q(d8 d8Var, Utilities.Callback callback, org.telegram.ui.ActionBar.d6 d6Var, View view, int i10) {
        if (view instanceof org.telegram.ui.Cells.j7) {
            MessageObject message = ((org.telegram.ui.Cells.j7) view).getMessage();
            if (message != null) {
                DownloadController.getInstance(d8Var.currentAccount).removeLoadingFileObserver(d8Var);
                if (d8Var.f4526g0 != null) {
                    FileLoader.getInstance(d8Var.currentAccount).cancelLoadFile(d8Var.f4526g0.getDocument());
                    d8Var.f4526g0 = null;
                }
                if (!message.attachPathExists && !message.mediaExists) {
                    String fileName = message.getFileName();
                    if (!TextUtils.isEmpty(fileName)) {
                        d8Var.f4526g0 = message;
                        DownloadController.getInstance(d8Var.currentAccount).addLoadingFileObserver(fileName, message, d8Var);
                        FileLoader.getInstance(d8Var.currentAccount).loadFile(message.getDocument(), message, 1, 0);
                        return;
                    }
                    return;
                }
                d8Var.f4525f0.run(message);
                d8 d8Var2 = d8Var.f4520a0;
                if (d8Var2 != null) {
                    d8Var2.dismiss();
                }
                d8Var.dismiss();
                return;
            }
            return;
        }
        w51 G = d8Var.f4535q0.G(i10 - 1);
        if (G != null && G.d == 1) {
            new d8(d8Var.getContext(), true, d8Var, callback, d6Var).show();
        } else if (G != null && G.d == 2) {
            d8Var.f4524e0.load();
        } else if (G != null && G.d == 3) {
            d8Var.b0();
        } else if (G != null && G.d == 4) {
            d8Var.a0();
        }
    }

    public static void R(d8 d8Var, TLObject tLObject) {
        ArrayList arrayList = d8Var.f4522c0;
        boolean z10 = false;
        d8Var.f4541w0 = false;
        d8Var.f4540v0 = false;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(d8Var.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(d8Var.currentAccount).putChats(messages_messages.chats, false);
            ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.Message message = arrayList2.get(i10);
                i10++;
                arrayList.add(new MessageObject(d8Var.currentAccount, message, false, true));
            }
            if ((messages_messages instanceof TLRPC.TL_messages_messagesSlice) && arrayList.size() < messages_messages.count) {
                z10 = true;
            }
            d8Var.f4539u0 = z10;
            d8Var.f4538t0 = messages_messages.next_rate;
        } else {
            d8Var.f4539u0 = false;
            d8Var.f4538t0 = 0;
        }
        d8Var.f4535q0.N(true);
    }

    public static void S(d8 d8Var, Long l4) {
        TLRPC.User user;
        boolean z10 = false;
        d8Var.F0 = false;
        if (l4 == null) {
            user = null;
        } else {
            user = MessagesController.getInstance(d8Var.currentAccount).getUser(l4);
        }
        d8Var.E0 = user;
        if (user == null) {
            z10 = true;
        }
        d8Var.G0 = z10;
        if (user != null) {
            d8Var.a0();
        }
    }

    public static void T(d8 d8Var) {
        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
        ArrayList arrayList = new ArrayList();
        try {
            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
            int i10 = -2000000000;
            while (query.moveToNext()) {
                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                audioEntry.f15825id = query.getInt(0);
                audioEntry.author = query.getString(1);
                audioEntry.title = query.getString(2);
                audioEntry.path = query.getString(3);
                audioEntry.duration = (int) (query.getLong(4) / 1000);
                audioEntry.genre = query.getString(5);
                File file = new File(audioEntry.path);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                tL_message.f18356id = i10;
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                long clientUserId = UserConfig.getInstance(d8Var.currentAccount).getClientUserId();
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
                document.f18341id = 0L;
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
                MessageObject messageObject = new MessageObject(d8Var.currentAccount, tL_message, false, true);
                audioEntry.messageObject = messageObject;
                arrayList.add(messageObject);
                i10--;
            }
            query.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new ai.ba(25, d8Var, arrayList));
    }

    public static boolean c0(String str, String str2, String str3) {
        if (str3 != null) {
            String lowerCase = str3.toLowerCase();
            if (!lowerCase.startsWith(str) && !org.telegram.messenger.f0.w(" ", str, lowerCase)) {
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                if (!translitSafe.startsWith(str2) && !org.telegram.messenger.f0.w(" ", str2, translitSafe)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
        int i11;
        if (i10 == 0) {
            vi viVar = this.f4530k0;
            viVar.setAlpha(f7);
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            viVar.setVisibility(i11);
        }
    }

    @Override
    public final void I(Canvas canvas, View view) {
        if (Build.VERSION.SDK_INT >= 31 && this.f4531l0 != null) {
            X();
            fh.d dVar = this.m0;
            if (dVar != null) {
                dVar.j(this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                dVar.l();
            }
            fh.d dVar2 = this.f4532n0;
            if (dVar2 != null) {
                dVar2.j(this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                dVar2.l();
            }
        }
        d0();
        super.I(canvas, view);
    }

    public final int W(boolean z10, ArrayList arrayList, String str, ArrayList arrayList2, boolean z11, boolean z12, int i10) {
        String lowerCase;
        int i11;
        if (arrayList2 != null && (!arrayList2.isEmpty() || z11)) {
            ArrayList arrayList3 = new ArrayList();
            String str2 = this.f4537s0;
            if (str2 == null) {
                lowerCase = null;
            } else {
                lowerCase = str2.toLowerCase();
            }
            String translitSafe = AndroidUtilities.translitSafe(lowerCase);
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                MessageObject messageObject = (MessageObject) obj;
                if (!z10) {
                    messageObject.setQuery(this.f4537s0);
                    arrayList3.add(messageObject);
                } else if (!TextUtils.isEmpty(lowerCase) && arrayList2 != this.f4522c0) {
                    String musicTitle = messageObject.getMusicTitle();
                    String musicAuthor = messageObject.getMusicAuthor();
                    if (c0(lowerCase, translitSafe, musicTitle) || c0(lowerCase, translitSafe, musicAuthor)) {
                        messageObject.setQuery(this.f4537s0);
                        arrayList3.add(messageObject);
                    }
                } else {
                    messageObject.setQuery(null);
                    arrayList3.add(messageObject);
                }
            }
            if (!arrayList3.isEmpty() || z11) {
                if (!arrayList.isEmpty() && arrayList.size() > 1) {
                    arrayList.add(w51.B(null));
                    i11 = AndroidUtilities.dp(12.0f);
                } else {
                    i11 = 0;
                }
                this.f4535q0.U();
                arrayList.add(w51.t(str));
                int size2 = arrayList3.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList3.get(i13);
                    i13++;
                    x7 x7Var = new x7(this, 0);
                    int i14 = org.telegram.ui.Cells.i7.f20462a;
                    w51 J = w51.J(org.telegram.ui.Cells.i7.class);
                    J.G = (MessageObject) obj2;
                    J.H = x7Var;
                    arrayList.add(J);
                    i11 += AndroidUtilities.dp(56.0f);
                }
                if (z11) {
                    arrayList.add(w51.n(4));
                    arrayList.add(w51.n(4));
                    arrayList.add(w51.n(4));
                    i11 += AndroidUtilities.dp(56.0f) * 3;
                }
                if (z12 && !z11) {
                    w51 c10 = w51.c(i10, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                    c10.f29900q = true;
                    arrayList.add(c10);
                    i11 += AndroidUtilities.dp(50.0f);
                }
                this.f4535q0.T();
                return i11;
            }
        }
        return 0;
    }

    public final void X() {
        ah.h hVar;
        if (Build.VERSION.SDK_INT >= 31 && (hVar = this.f4531l0) != null) {
            this.N0.set(0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, this.containerView.getMeasuredWidth(), AndroidUtilities.dp(64.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
            ArrayList arrayList = this.M0;
            ArrayList arrayList2 = this.O0;
            hVar.g(yf.e0.a(arrayList, 1, arrayList2), arrayList2);
            hVar.e(this.f4534p0, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
        }
    }

    public final void Y() {
        if (this.H0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.H0, true);
        }
        this.H0 = -1;
        this.A0 = "";
        this.B0 = false;
        this.f4523d0.clear();
        this.C0 = false;
        this.D0 = false;
    }

    public final void Z() {
        if (this.f4543y0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f4543y0, true);
        }
        this.f4543y0 = -1;
        this.f4538t0 = 0;
        this.f4522c0.clear();
        this.f4540v0 = false;
        this.f4541w0 = false;
    }

    public final void a0() {
        String str = MessagesController.getInstance(this.currentAccount).config.musicSearchUsername.get();
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.I0;
            String str3 = this.f4537s0;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            if (!TextUtils.equals(str2, str3)) {
                Y();
            }
            if (!this.C0 && !TextUtils.isEmpty(this.f4537s0) && this.f4537s0.length() >= 3) {
                ArrayList arrayList = this.f4523d0;
                if (arrayList.isEmpty() || this.B0) {
                    if (this.E0 == null) {
                        this.E0 = MessagesController.getInstance(this.currentAccount).getUser(str);
                    }
                    if (this.E0 == null) {
                        if (!this.F0 && !this.G0) {
                            this.F0 = true;
                            MessagesController.getInstance(this.currentAccount).getUserNameResolver().resolve(str, new ai.y1(this, 14));
                            return;
                        }
                        return;
                    }
                    this.C0 = true;
                    TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
                    TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                    tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.E0);
                    tL_messages_getInlineBotResults.peer = MessagesController.getInputPeer(currentUser);
                    tL_messages_getInlineBotResults.offset = (arrayList.isEmpty() || (r0 = this.A0) == null) ? "" : "";
                    String str5 = this.f4537s0;
                    if (str5 != null) {
                        str4 = str5;
                    }
                    this.I0 = str4;
                    tL_messages_getInlineBotResults.query = str4;
                    this.H0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_getInlineBotResults, new Object(), new u7(this, 1));
                    this.f4535q0.N(true);
                }
            }
        }
    }

    public final void b0() {
        if (!this.Z) {
            String str = this.f4542x0;
            String str2 = this.f4537s0;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            if (!TextUtils.equals(str, str2)) {
                Z();
            }
            if (!this.f4540v0) {
                ArrayList arrayList = this.f4522c0;
                if (!arrayList.isEmpty() && !this.f4539u0) {
                    return;
                }
                this.f4540v0 = true;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
                String str4 = this.f4537s0;
                if (str4 != null) {
                    str3 = str4;
                }
                this.f4542x0 = str3;
                tL_messages_searchGlobal.f18446q = str3;
                tL_messages_searchGlobal.limit = 20;
                if (arrayList.size() > 0) {
                    MessageObject messageObject = (MessageObject) hg.c.g(1, arrayList);
                    tL_messages_searchGlobal.offset_id = messageObject.getId();
                    tL_messages_searchGlobal.offset_rate = this.f4538t0;
                    tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
                } else {
                    tL_messages_searchGlobal.offset_rate = 0;
                    tL_messages_searchGlobal.offset_id = 0;
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                this.f4543y0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_searchGlobal, new ai.n8(this, 4));
                this.f4535q0.N(true);
            }
        }
    }

    public final void d0() {
        float f7 = AndroidUtilities.displaySize.y;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            xl0 xl0Var = this.d;
            if (i10 >= xl0Var.getChildCount()) {
                break;
            }
            View childAt = xl0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f7) {
                f7 = childAt.getY();
            }
            i10++;
        }
        this.f4529j0.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, f7));
        if (f7 <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) {
            z10 = true;
        }
        this.X.a(z10, true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.musicListLoaded) {
            this.f4535q0.N(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f4536r0 != null && MediaController.getInstance().isPlayingMessage(this.f4536r0)) {
            MediaController.getInstance().cleanupPlayer(true, true);
        }
        this.f4536r0 = null;
    }

    @Override
    public final int getObserverTag() {
        return this.Y;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.musicListLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.musicListLoaded);
    }

    @Override
    public final void onSuccessDownload(String str) {
        MessageObject messageObject = this.f4526g0;
        if (messageObject != null && TextUtils.equals(messageObject.getFileName(), str)) {
            this.f4525f0.run(this.f4526g0);
            d8 d8Var = this.f4520a0;
            if (d8Var != null) {
                d8Var.dismiss();
            }
            dismiss();
        }
    }

    @Override
    public final wl0 v(xl0 xl0Var) {
        k61 k61Var = new k61(xl0Var, getContext(), this.currentAccount, 0, false, new u7(this, 0), this.resourcesProvider);
        this.f4535q0 = k61Var;
        k61Var.f25644r = false;
        return k61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoryMusicTitle2);
    }

    @Override
    public final void C(float f7, int i10) {
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
    }

    @Override
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
