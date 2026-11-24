package defpackage;

import android.animation.ValueAnimator;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.TwoStepVerificationActivity;
public class zc2 extends d implements gk7 {
    public int A0;
    public boolean B0;
    public int C0;
    public int D0;
    public final int E;
    public int E0;
    public final boolean F;
    public int F0;
    public final boolean G;
    public int G0;
    public final boolean H;
    public int H0;
    public boolean I;
    public int I0;
    public final boolean J;
    public int J0;
    public float K;
    public int K0;
    public boolean L;
    public int L0;
    public final boolean M;
    public int M0;
    public final TLRPC.TL_chatAdminRights N;
    public int N0;
    public final TLRPC.TL_chatAdminRights O;
    public int O0;
    public TLRPC.TL_chatBannedRights P;
    public boolean P0;
    public final TLRPC.TL_chatBannedRights Q;
    public int Q0;
    public boolean R;
    public int R0;
    public final String S;
    public int S0;
    public String T;
    public int T0;
    public final String U;
    public boolean U0;
    public final boolean V;
    public int V0;
    public int W;
    public int W0;
    public int X;
    public int X0;
    public int Y;
    public wc2 Y0;
    public int Z;
    public final String Z0;
    public yc2 a;
    public int a0;
    public final boolean a1;
    public fu b;
    public int b0;
    public final boolean b1;
    public zr c;
    public int c0;
    public ValueAnimator c1;
    public FrameLayout d;
    public int d0;
    public FrameLayout e;
    public int e0;
    public hn f;
    public int f0;
    public int g0;
    public sha h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public long n;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public boolean r;
    public int r0;
    public long s;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public final TLRPC.User w;
    public int w0;
    public TLRPC.Chat x;
    public int x0;
    public TLRPC.ChatFull y;
    public int y0;
    public int z0;

    public zc2(long j, long j2, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i, boolean z, boolean z2, String str2) {
        super(null);
        boolean z3;
        boolean z4;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        boolean z5;
        float f;
        boolean z6;
        boolean z7;
        TLRPC.UserFull W1;
        TLRPC.TL_chatAdminRights tL_chatAdminRights3;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        TLRPC.TL_chatBannedRights tL_chatBannedRights3;
        boolean z26;
        boolean z27;
        TLRPC.TL_chatAdminRights tL_chatAdminRights4 = tL_chatAdminRights;
        this.I = false;
        this.K = 0.0f;
        this.L = false;
        this.M = false;
        this.S = "";
        this.a1 = z2;
        this.s = j2;
        TLRPC.User V1 = na7.q1(this.currentAccount).V1(Long.valueOf(j));
        this.w = V1;
        this.E = i;
        this.J = z;
        boolean z28 = true;
        boolean z29 = !z;
        this.U0 = z29;
        this.P0 = z29;
        this.Z0 = str2;
        this.x = getMessagesController().K0(Long.valueOf(this.s));
        this.y = getMessagesController().L0(this.s);
        if (V1 != null && V1.bot_guard) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.V = z3;
        String str3 = str != null ? str : "";
        this.T = str3;
        this.U = str3;
        this.G = hc2.Y(this.x);
        TLRPC.Chat chat = this.x;
        if (chat != null) {
            if (hc2.T(chat) && !this.x.megagroup) {
                z27 = true;
            } else {
                z27 = false;
            }
            this.F = z27;
            this.H = hc2.c0(this.x);
            chat = this.x;
            this.O = chat.admin_rights;
        }
        if (this.O == null) {
            if (i == 2 && (chat == null || !chat.creator)) {
                z26 = false;
            } else {
                z26 = true;
            }
            this.O = d0(z26);
        }
        if (i != 0 && i != 2) {
            if (i == 1) {
                this.Q = tL_chatBannedRights;
                if (tL_chatBannedRights == null) {
                    tL_chatBannedRights3 = new TLRPC.TL_chatBannedRights();
                    this.Q = tL_chatBannedRights3;
                    tL_chatBannedRights3.view_messages = false;
                    tL_chatBannedRights3.send_media = false;
                    tL_chatBannedRights3.send_messages = false;
                    tL_chatBannedRights3.embed_links = false;
                    tL_chatBannedRights3.send_stickers = false;
                    tL_chatBannedRights3.send_gifs = false;
                    tL_chatBannedRights3.send_games = false;
                    tL_chatBannedRights3.send_inline = false;
                    tL_chatBannedRights3.send_polls = false;
                    tL_chatBannedRights3.invite_users = false;
                    tL_chatBannedRights3.change_info = false;
                    tL_chatBannedRights3.pin_messages = false;
                    tL_chatBannedRights3.manage_topics = false;
                    tL_chatBannedRights3.send_plain = false;
                    tL_chatBannedRights3.send_videos = false;
                    tL_chatBannedRights3.send_photos = false;
                    tL_chatBannedRights3.send_audios = false;
                    tL_chatBannedRights3.send_docs = false;
                    tL_chatBannedRights3.send_voices = false;
                    tL_chatBannedRights3.send_roundvideos = false;
                    tL_chatBannedRights3.edit_rank = false;
                    tL_chatBannedRights3.send_reactions = false;
                } else {
                    tL_chatBannedRights3 = tL_chatBannedRights;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights4 = new TLRPC.TL_chatBannedRights();
                this.P = tL_chatBannedRights4;
                if (tL_chatBannedRights2 == null) {
                    tL_chatBannedRights4.view_messages = false;
                    tL_chatBannedRights4.send_media = false;
                    tL_chatBannedRights4.send_messages = false;
                    tL_chatBannedRights4.embed_links = false;
                    tL_chatBannedRights4.send_stickers = false;
                    tL_chatBannedRights4.send_gifs = false;
                    tL_chatBannedRights4.send_games = false;
                    tL_chatBannedRights4.send_inline = false;
                    tL_chatBannedRights4.send_polls = false;
                    tL_chatBannedRights4.invite_users = false;
                    tL_chatBannedRights4.change_info = false;
                    tL_chatBannedRights4.pin_messages = false;
                    tL_chatBannedRights4.manage_topics = false;
                    tL_chatBannedRights4.edit_rank = false;
                    tL_chatBannedRights4.send_reactions = false;
                } else {
                    tL_chatBannedRights4.view_messages = tL_chatBannedRights2.view_messages;
                    tL_chatBannedRights4.send_messages = tL_chatBannedRights2.send_messages;
                    tL_chatBannedRights4.send_media = tL_chatBannedRights2.send_media;
                    tL_chatBannedRights4.send_stickers = tL_chatBannedRights2.send_stickers;
                    tL_chatBannedRights4.send_gifs = tL_chatBannedRights2.send_gifs;
                    tL_chatBannedRights4.send_games = tL_chatBannedRights2.send_games;
                    tL_chatBannedRights4.send_inline = tL_chatBannedRights2.send_inline;
                    tL_chatBannedRights4.embed_links = tL_chatBannedRights2.embed_links;
                    tL_chatBannedRights4.send_polls = tL_chatBannedRights2.send_polls;
                    tL_chatBannedRights4.invite_users = tL_chatBannedRights2.invite_users;
                    tL_chatBannedRights4.change_info = tL_chatBannedRights2.change_info;
                    tL_chatBannedRights4.pin_messages = tL_chatBannedRights2.pin_messages;
                    tL_chatBannedRights4.until_date = tL_chatBannedRights2.until_date;
                    tL_chatBannedRights4.manage_topics = tL_chatBannedRights2.manage_topics;
                    tL_chatBannedRights4.send_photos = tL_chatBannedRights2.send_photos;
                    tL_chatBannedRights4.send_videos = tL_chatBannedRights2.send_videos;
                    tL_chatBannedRights4.send_roundvideos = tL_chatBannedRights2.send_roundvideos;
                    tL_chatBannedRights4.send_audios = tL_chatBannedRights2.send_audios;
                    tL_chatBannedRights4.send_voices = tL_chatBannedRights2.send_voices;
                    tL_chatBannedRights4.send_docs = tL_chatBannedRights2.send_docs;
                    tL_chatBannedRights4 = this.P;
                    tL_chatBannedRights4.send_plain = tL_chatBannedRights2.send_plain;
                    tL_chatBannedRights4.edit_rank = tL_chatBannedRights2.edit_rank;
                    tL_chatBannedRights4.send_reactions = tL_chatBannedRights2.send_reactions;
                }
                if (tL_chatBannedRights3.view_messages) {
                    tL_chatBannedRights4.view_messages = true;
                }
                if (tL_chatBannedRights3.send_messages) {
                    tL_chatBannedRights4.send_messages = true;
                }
                if (tL_chatBannedRights3.send_media) {
                    tL_chatBannedRights4.send_media = true;
                }
                if (tL_chatBannedRights3.send_stickers) {
                    tL_chatBannedRights4.send_stickers = true;
                }
                if (tL_chatBannedRights3.send_gifs) {
                    tL_chatBannedRights4.send_gifs = true;
                }
                if (tL_chatBannedRights3.send_games) {
                    tL_chatBannedRights4.send_games = true;
                }
                if (tL_chatBannedRights3.send_inline) {
                    tL_chatBannedRights4.send_inline = true;
                }
                if (tL_chatBannedRights3.embed_links) {
                    tL_chatBannedRights4.embed_links = true;
                }
                if (tL_chatBannedRights3.send_polls) {
                    tL_chatBannedRights4.send_polls = true;
                }
                if (tL_chatBannedRights3.invite_users) {
                    tL_chatBannedRights4.invite_users = true;
                }
                if (tL_chatBannedRights3.change_info) {
                    tL_chatBannedRights4.change_info = true;
                }
                if (tL_chatBannedRights3.pin_messages) {
                    tL_chatBannedRights4.pin_messages = true;
                }
                if (tL_chatBannedRights3.edit_rank) {
                    tL_chatBannedRights4.edit_rank = true;
                }
                if (tL_chatBannedRights3.send_reactions) {
                    tL_chatBannedRights4.send_reactions = true;
                }
                if (tL_chatBannedRights3.manage_topics) {
                    tL_chatBannedRights4.manage_topics = true;
                }
                if (tL_chatBannedRights3.send_photos) {
                    tL_chatBannedRights4.send_photos = true;
                }
                if (tL_chatBannedRights3.send_videos) {
                    tL_chatBannedRights4.send_videos = true;
                }
                if (tL_chatBannedRights3.send_audios) {
                    tL_chatBannedRights4.send_audios = true;
                }
                if (tL_chatBannedRights3.send_docs) {
                    tL_chatBannedRights4.send_docs = true;
                }
                if (tL_chatBannedRights3.send_voices) {
                    tL_chatBannedRights4.send_voices = true;
                }
                if (tL_chatBannedRights3.send_roundvideos) {
                    tL_chatBannedRights4.send_roundvideos = true;
                }
                if (tL_chatBannedRights3.send_plain) {
                    tL_chatBannedRights4.send_plain = true;
                }
                this.S = hc2.D(tL_chatBannedRights4);
                if (tL_chatBannedRights2 != null && tL_chatBannedRights2.view_messages) {
                    z28 = false;
                }
                this.b1 = z28;
            }
            z7 = false;
        } else {
            if (i == 2 && (W1 = getMessagesController().W1(j)) != null) {
                if (this.F) {
                    tL_chatAdminRights3 = W1.bot_broadcast_admin_rights;
                } else {
                    tL_chatAdminRights3 = W1.bot_group_admin_rights;
                }
                if (tL_chatAdminRights3 != null) {
                    if (tL_chatAdminRights4 == null) {
                        tL_chatAdminRights4 = tL_chatAdminRights3;
                    } else {
                        if (!tL_chatAdminRights4.ban_users && !tL_chatAdminRights3.ban_users) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        tL_chatAdminRights4.ban_users = z8;
                        if (!tL_chatAdminRights4.add_admins && !tL_chatAdminRights3.add_admins) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        tL_chatAdminRights4.add_admins = z9;
                        if (!tL_chatAdminRights4.post_messages && !tL_chatAdminRights3.post_messages) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        tL_chatAdminRights4.post_messages = z10;
                        if (!tL_chatAdminRights4.pin_messages && !tL_chatAdminRights3.pin_messages) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        tL_chatAdminRights4.pin_messages = z11;
                        if (!tL_chatAdminRights4.manage_ranks && !tL_chatAdminRights3.manage_ranks) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        tL_chatAdminRights4.manage_ranks = z12;
                        if (!tL_chatAdminRights4.delete_messages && !tL_chatAdminRights3.delete_messages) {
                            z13 = false;
                        } else {
                            z13 = true;
                        }
                        tL_chatAdminRights4.delete_messages = z13;
                        if (!tL_chatAdminRights4.change_info && !tL_chatAdminRights3.change_info) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        tL_chatAdminRights4.change_info = z14;
                        if (!tL_chatAdminRights4.anonymous && !tL_chatAdminRights3.anonymous) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        tL_chatAdminRights4.anonymous = z15;
                        if (!tL_chatAdminRights4.edit_messages && !tL_chatAdminRights3.edit_messages) {
                            z16 = false;
                        } else {
                            z16 = true;
                        }
                        tL_chatAdminRights4.edit_messages = z16;
                        if (!tL_chatAdminRights4.manage_call && !tL_chatAdminRights3.manage_call) {
                            z17 = false;
                        } else {
                            z17 = true;
                        }
                        tL_chatAdminRights4.manage_call = z17;
                        if (!tL_chatAdminRights4.manage_topics && !tL_chatAdminRights3.manage_topics) {
                            z18 = false;
                        } else {
                            z18 = true;
                        }
                        tL_chatAdminRights4.manage_topics = z18;
                        if (!tL_chatAdminRights4.post_stories && !tL_chatAdminRights3.post_stories) {
                            z19 = false;
                        } else {
                            z19 = true;
                        }
                        tL_chatAdminRights4.post_stories = z19;
                        if (!tL_chatAdminRights4.edit_stories && !tL_chatAdminRights3.edit_stories) {
                            z20 = false;
                        } else {
                            z20 = true;
                        }
                        tL_chatAdminRights4.edit_stories = z20;
                        if (!tL_chatAdminRights4.delete_stories && !tL_chatAdminRights3.delete_stories) {
                            z21 = false;
                        } else {
                            z21 = true;
                        }
                        tL_chatAdminRights4.delete_stories = z21;
                        if (!tL_chatAdminRights4.manage_direct_messages && !tL_chatAdminRights3.manage_direct_messages) {
                            z22 = false;
                        } else {
                            z22 = true;
                        }
                        tL_chatAdminRights4.manage_direct_messages = z22;
                        if (!tL_chatAdminRights4.manage_welcome_messages && !tL_chatAdminRights3.manage_welcome_messages) {
                            z23 = false;
                        } else {
                            z23 = true;
                        }
                        tL_chatAdminRights4.manage_welcome_messages = z23;
                        if (!tL_chatAdminRights4.manage_linked_peers && !tL_chatAdminRights3.manage_linked_peers) {
                            z24 = false;
                        } else {
                            z24 = true;
                        }
                        tL_chatAdminRights4.manage_linked_peers = z24;
                        if (!tL_chatAdminRights4.other && !tL_chatAdminRights3.other) {
                            z25 = false;
                        } else {
                            z25 = true;
                        }
                        tL_chatAdminRights4.other = z25;
                    }
                }
            }
            if (tL_chatAdminRights4 == null) {
                this.M = false;
                if (i == 2) {
                    tL_chatAdminRights2 = d0(false);
                    this.N = tL_chatAdminRights2;
                    boolean z30 = this.F;
                    this.L = z30;
                    this.K = z30 ? 1.0f : 0.0f;
                    this.b1 = false;
                } else {
                    tL_chatAdminRights2 = new TLRPC.TL_chatAdminRights();
                    this.N = tL_chatAdminRights2;
                    TLRPC.TL_chatAdminRights tL_chatAdminRights5 = this.O;
                    tL_chatAdminRights2.change_info = tL_chatAdminRights5.change_info;
                    tL_chatAdminRights2.post_messages = tL_chatAdminRights5.post_messages;
                    tL_chatAdminRights2.edit_messages = tL_chatAdminRights5.edit_messages;
                    tL_chatAdminRights2.delete_messages = tL_chatAdminRights5.delete_messages;
                    tL_chatAdminRights2.manage_call = tL_chatAdminRights5.manage_call;
                    tL_chatAdminRights2.ban_users = tL_chatAdminRights5.ban_users;
                    tL_chatAdminRights2.invite_users = tL_chatAdminRights5.invite_users;
                    tL_chatAdminRights2.pin_messages = tL_chatAdminRights5.pin_messages;
                    tL_chatAdminRights2.manage_ranks = tL_chatAdminRights5.manage_ranks;
                    tL_chatAdminRights2.manage_topics = tL_chatAdminRights5.manage_topics;
                    tL_chatAdminRights2.post_stories = tL_chatAdminRights5.post_stories;
                    tL_chatAdminRights2.edit_stories = tL_chatAdminRights5.edit_stories;
                    tL_chatAdminRights2.delete_stories = tL_chatAdminRights5.delete_stories;
                    tL_chatAdminRights2.manage_direct_messages = tL_chatAdminRights5.manage_direct_messages;
                    tL_chatAdminRights2.manage_welcome_messages = tL_chatAdminRights5.manage_welcome_messages;
                    tL_chatAdminRights2.manage_linked_peers = tL_chatAdminRights5.manage_linked_peers;
                    tL_chatAdminRights2.other = tL_chatAdminRights5.other;
                    this.b1 = false;
                }
            } else {
                this.M = true;
                TLRPC.TL_chatAdminRights tL_chatAdminRights6 = new TLRPC.TL_chatAdminRights();
                this.N = tL_chatAdminRights6;
                boolean z31 = tL_chatAdminRights4.change_info;
                tL_chatAdminRights6.change_info = z31;
                boolean z32 = tL_chatAdminRights4.post_messages;
                tL_chatAdminRights6.post_messages = z32;
                boolean z33 = tL_chatAdminRights4.edit_messages;
                tL_chatAdminRights6.edit_messages = z33;
                boolean z34 = tL_chatAdminRights4.delete_messages;
                tL_chatAdminRights6.delete_messages = z34;
                boolean z35 = tL_chatAdminRights4.manage_call;
                tL_chatAdminRights6.manage_call = z35;
                boolean z36 = tL_chatAdminRights4.ban_users;
                tL_chatAdminRights6.ban_users = z36;
                boolean z37 = tL_chatAdminRights4.invite_users;
                tL_chatAdminRights6.invite_users = z37;
                boolean z38 = tL_chatAdminRights4.pin_messages;
                tL_chatAdminRights6.pin_messages = z38;
                boolean z39 = tL_chatAdminRights4.manage_ranks;
                tL_chatAdminRights6.manage_ranks = z39;
                boolean z40 = tL_chatAdminRights4.manage_topics;
                tL_chatAdminRights6.manage_topics = z40;
                tL_chatAdminRights6.post_stories = tL_chatAdminRights4.post_stories;
                tL_chatAdminRights6.edit_stories = tL_chatAdminRights4.edit_stories;
                tL_chatAdminRights6.delete_stories = tL_chatAdminRights4.delete_stories;
                boolean z41 = tL_chatAdminRights4.manage_direct_messages;
                tL_chatAdminRights6.manage_direct_messages = z41;
                boolean z42 = tL_chatAdminRights4.manage_welcome_messages;
                tL_chatAdminRights6.manage_welcome_messages = z42;
                boolean z43 = tL_chatAdminRights4.manage_linked_peers;
                tL_chatAdminRights6.manage_linked_peers = z43;
                boolean z44 = tL_chatAdminRights4.add_admins;
                tL_chatAdminRights6.add_admins = z44;
                boolean z45 = tL_chatAdminRights4.anonymous;
                tL_chatAdminRights6.anonymous = z45;
                boolean z46 = tL_chatAdminRights4.other;
                tL_chatAdminRights6.other = z46;
                if (!z31 && !z32 && !z41 && !z42 && !z33 && !z34 && !z36 && !z37 && !z43 && !z38 && !z39 && !z44 && !z35 && !z45 && !z40 && !z46) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                this.b1 = z4;
                if (i == 2) {
                    if (!this.F && !z4) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    this.L = z5;
                    if (z5) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    this.K = f;
                    this.b1 = false;
                }
                tL_chatAdminRights2 = tL_chatAdminRights6;
            }
            TLRPC.Chat chat2 = this.x;
            if (chat2 != null) {
                this.Q = chat2.default_banned_rights;
            }
            if (this.Q == null) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights5 = new TLRPC.TL_chatBannedRights();
                this.Q = tL_chatBannedRights5;
                tL_chatBannedRights5.view_messages = false;
                tL_chatBannedRights5.send_media = false;
                tL_chatBannedRights5.send_messages = false;
                tL_chatBannedRights5.embed_links = false;
                tL_chatBannedRights5.send_stickers = false;
                tL_chatBannedRights5.send_gifs = false;
                tL_chatBannedRights5.send_games = false;
                tL_chatBannedRights5.send_inline = false;
                tL_chatBannedRights5.send_polls = false;
                tL_chatBannedRights5.invite_users = false;
                tL_chatBannedRights5.change_info = false;
                tL_chatBannedRights5.pin_messages = false;
                tL_chatBannedRights5.manage_topics = false;
                tL_chatBannedRights5.send_plain = false;
                tL_chatBannedRights5.send_videos = false;
                tL_chatBannedRights5.send_photos = false;
                tL_chatBannedRights5.send_audios = false;
                tL_chatBannedRights5.send_docs = false;
                tL_chatBannedRights5.send_voices = false;
                tL_chatBannedRights5.send_roundvideos = false;
                tL_chatBannedRights5.edit_rank = false;
                tL_chatBannedRights5.send_reactions = false;
            }
            TLRPC.TL_chatBannedRights tL_chatBannedRights6 = this.Q;
            if (!tL_chatBannedRights6.change_info && !this.F) {
                z6 = true;
                tL_chatAdminRights2.change_info = true;
            } else {
                z6 = true;
            }
            if (!tL_chatBannedRights6.pin_messages) {
                tL_chatAdminRights2.pin_messages = z6;
            }
            z7 = false;
        }
        r0(z7);
    }

    public static TLRPC.TL_chatAdminRights d0(boolean z) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights = new TLRPC.TL_chatAdminRights();
        tL_chatAdminRights.manage_linked_peers = z;
        tL_chatAdminRights.manage_ranks = z;
        tL_chatAdminRights.manage_welcome_messages = z;
        tL_chatAdminRights.manage_direct_messages = z;
        tL_chatAdminRights.delete_stories = z;
        tL_chatAdminRights.edit_stories = z;
        tL_chatAdminRights.post_stories = z;
        tL_chatAdminRights.manage_topics = z;
        tL_chatAdminRights.manage_call = z;
        tL_chatAdminRights.add_admins = z;
        tL_chatAdminRights.pin_messages = z;
        tL_chatAdminRights.invite_users = z;
        tL_chatAdminRights.ban_users = z;
        tL_chatAdminRights.delete_messages = z;
        tL_chatAdminRights.edit_messages = z;
        tL_chatAdminRights.post_messages = z;
        tL_chatAdminRights.change_info = z;
        return tL_chatAdminRights;
    }

    public static TLRPC.TL_chatAdminRights o0(TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatAdminRights tL_chatAdminRights2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = new TLRPC.TL_chatAdminRights();
        boolean z17 = true;
        if (!tL_chatAdminRights.change_info && !tL_chatAdminRights2.change_info) {
            z = false;
        } else {
            z = true;
        }
        tL_chatAdminRights3.change_info = z;
        if (!tL_chatAdminRights.post_messages && !tL_chatAdminRights2.post_messages) {
            z2 = false;
        } else {
            z2 = true;
        }
        tL_chatAdminRights3.post_messages = z2;
        if (!tL_chatAdminRights.edit_messages && !tL_chatAdminRights2.edit_messages) {
            z3 = false;
        } else {
            z3 = true;
        }
        tL_chatAdminRights3.edit_messages = z3;
        if (!tL_chatAdminRights.delete_messages && !tL_chatAdminRights2.delete_messages) {
            z4 = false;
        } else {
            z4 = true;
        }
        tL_chatAdminRights3.delete_messages = z4;
        if (!tL_chatAdminRights.ban_users && !tL_chatAdminRights2.ban_users) {
            z5 = false;
        } else {
            z5 = true;
        }
        tL_chatAdminRights3.ban_users = z5;
        if (!tL_chatAdminRights.invite_users && !tL_chatAdminRights2.invite_users) {
            z6 = false;
        } else {
            z6 = true;
        }
        tL_chatAdminRights3.invite_users = z6;
        if (!tL_chatAdminRights.pin_messages && !tL_chatAdminRights2.pin_messages) {
            z7 = false;
        } else {
            z7 = true;
        }
        tL_chatAdminRights3.pin_messages = z7;
        if (!tL_chatAdminRights.manage_ranks && !tL_chatAdminRights2.manage_ranks) {
            z8 = false;
        } else {
            z8 = true;
        }
        tL_chatAdminRights3.manage_ranks = z8;
        if (!tL_chatAdminRights.add_admins && !tL_chatAdminRights2.add_admins) {
            z9 = false;
        } else {
            z9 = true;
        }
        tL_chatAdminRights3.add_admins = z9;
        if (!tL_chatAdminRights.manage_call && !tL_chatAdminRights2.manage_call) {
            z10 = false;
        } else {
            z10 = true;
        }
        tL_chatAdminRights3.manage_call = z10;
        if (!tL_chatAdminRights.manage_topics && !tL_chatAdminRights2.manage_topics) {
            z11 = false;
        } else {
            z11 = true;
        }
        tL_chatAdminRights3.manage_topics = z11;
        if (!tL_chatAdminRights.post_stories && !tL_chatAdminRights2.post_stories) {
            z12 = false;
        } else {
            z12 = true;
        }
        tL_chatAdminRights3.post_stories = z12;
        if (!tL_chatAdminRights.edit_stories && !tL_chatAdminRights2.edit_stories) {
            z13 = false;
        } else {
            z13 = true;
        }
        tL_chatAdminRights3.edit_stories = z13;
        if (!tL_chatAdminRights.delete_stories && !tL_chatAdminRights2.delete_stories) {
            z14 = false;
        } else {
            z14 = true;
        }
        tL_chatAdminRights3.delete_stories = z14;
        if (!tL_chatAdminRights.manage_direct_messages && !tL_chatAdminRights2.manage_direct_messages) {
            z15 = false;
        } else {
            z15 = true;
        }
        tL_chatAdminRights3.manage_direct_messages = z15;
        if (!tL_chatAdminRights.manage_welcome_messages && !tL_chatAdminRights2.manage_welcome_messages) {
            z16 = false;
        } else {
            z16 = true;
        }
        tL_chatAdminRights3.manage_welcome_messages = z16;
        if (!tL_chatAdminRights.manage_linked_peers && !tL_chatAdminRights2.manage_linked_peers) {
            z17 = false;
        }
        tL_chatAdminRights3.manage_linked_peers = z17;
        return tL_chatAdminRights3;
    }

    public final boolean a0() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.Q;
        if (tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) {
            return true;
        }
        return false;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.D5));
        hashSet.add(Integer.valueOf(bkb.C5));
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.G6));
        hashSet.add(Integer.valueOf(bkb.z6));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.l6));
        hashSet.add(Integer.valueOf(bkb.H6));
        hashSet.add(Integer.valueOf(bkb.o7));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.r8));
        hashSet.add(Integer.valueOf(bkb.c6));
    }

    public final boolean b0(boolean z) {
        boolean equals;
        int i = this.E;
        if (i != 2) {
            if (i == 1) {
                equals = this.S.equals(hc2.D(this.P));
            } else {
                equals = this.U.equals(this.T);
            }
            if (!equals) {
                if (z) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = k96.M0(2131743487, null);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.S = M0;
                    hdVar.U = gl.S2(k96.a0("UserRestrictionsApplyChangesText", null, 2131743486, na7.q1(this.currentAccount).K0(Long.valueOf(this.s)).title));
                    alertDialog$Builder.j(k96.M0(2131754213, null), new qc2(this, (byte) 0));
                    alertDialog$Builder.g(k96.M0(2131747387, null), new qc2(this, (byte) 4));
                    showDialog(hdVar);
                }
                return false;
            }
        }
        return true;
    }

    public final void c0() {
        boolean z;
        TLRPC.User user;
        long j;
        int i = this.l0;
        if (i >= 0) {
            zgb zgbVar = (zgb) this.c.m(i);
            if (zgbVar != null) {
                TLRPC.ChatFull chatFull = this.y;
                if (chatFull != null && (user = this.w) != null) {
                    if (this.r) {
                        j = this.n;
                    } else {
                        j = chatFull.guard_bot_id;
                    }
                    if (j == user.id) {
                        z = true;
                        zgbVar.setChecked(z);
                        return;
                    }
                }
                z = false;
                zgbVar.setChecked(z);
                return;
            }
            this.a.g(this.l0);
        }
    }

    @Override
    public final View createView(Context context) {
        boolean z;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        pha phaVar = this.simpleActionBar;
        int i = 2;
        int i2 = this.E;
        if (i2 == 0) {
            phaVar.setTitle(k96.M0(2131751320, null));
        } else if (i2 == 2) {
            phaVar.setTitle(k96.M0(2131754460, null));
        } else {
            phaVar.setTitle(k96.M0(2131743488, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 27));
        if (this.J || (!this.F && this.x.creator && l7c.D(this.w))) {
            this.h = this.simpleActionBar.s(k96.M0(2131745754, null));
        }
        r71 r71Var = new r71(this, context, (byte) 1);
        this.fragmentView = r71Var;
        r71Var.setFocusableInTouchMode(true);
        fu fuVar = new fu((byte) 12, context, this);
        this.b = fuVar;
        if (i2 != 2) {
            z = true;
        } else {
            z = false;
        }
        fuVar.setClipChildren(z);
        zr zrVar = new zr((byte) 4, 1, false);
        this.c = zrVar;
        zrVar.E = (byte) 100;
        this.b.setLayoutManager(zrVar);
        fu fuVar2 = this.b;
        yc2 yc2Var = new yc2(this, context);
        this.a = yc2Var;
        fuVar2.setAdapter(yc2Var);
        gb3 gb3Var = new gb3();
        if (i2 == 2) {
            this.b.setResetSelectorOnChanged(false);
        }
        gb3Var.m = false;
        gb3Var.C = false;
        gb3Var.o(s33.h);
        gb3Var.n(350L);
        this.b.setItemAnimator(gb3Var);
        fu fuVar3 = this.b;
        if (k96.a0) {
            i = 1;
        }
        fuVar3.setVerticalScrollbarPosition(i);
        r71Var.addView(this.b, nme.c(-1.0f, -1));
        this.b.r1();
        this.b.setOnScrollListener(new y(this, (byte) 24));
        this.b.setSectionsDrawBackground(true);
        this.b.setOnItemClickListener(new k0(this, context, (byte) 10));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.S) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            TLRPC.Chat chat = this.x;
            if (chat != null && chatFull.id == chat.id) {
                this.y = chatFull;
                c0();
            }
        } else if (i == kk7.x1) {
            if ((-this.s) == ((Long) objArr[0]).longValue()) {
                ui5 ui5Var = this.parentLayout;
                if (ui5Var != null && ui5Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    public final void e0(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        if (getParentActivity() == null) {
            return;
        }
        if (tL_inputCheckPasswordSRP != null && !hc2.T(this.x)) {
            na7.q1(this.currentAccount).P(getParentActivity(), this.s, this, new ie(this, tL_inputCheckPasswordSRP, twoStepVerificationActivity, (byte) 29), null);
            return;
        }
        TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
        if (hc2.T(this.x)) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_channels_editCreator.channel = tL_inputChannel;
            TLRPC.Chat chat = this.x;
            tL_inputChannel.channel_id = chat.id;
            tL_inputChannel.access_hash = chat.access_hash;
        } else {
            tL_channels_editCreator.channel = new TLRPC.TL_inputChannelEmpty();
        }
        if (tL_inputCheckPasswordSRP != null) {
            tL_inputCheckPasswordEmpty = tL_inputCheckPasswordSRP;
        } else {
            tL_inputCheckPasswordEmpty = new TLRPC.TL_inputCheckPasswordEmpty();
        }
        tL_channels_editCreator.password = tL_inputCheckPasswordEmpty;
        tL_channels_editCreator.user_id = getMessagesController().o1(this.w);
        getConnectionsManager().sendRequest(tL_channels_editCreator, new rt0(this, tL_inputCheckPasswordSRP, twoStepVerificationActivity, tL_channels_editCreator, (byte) 4));
    }

    public final boolean f0() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights = this.N;
        boolean z = tL_chatAdminRights.change_info;
        boolean z2 = this.H;
        if (!z || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.ban_users || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.pin_messages || !tL_chatAdminRights.manage_ranks || ((z2 && !tL_chatAdminRights.manage_topics) || !tL_chatAdminRights.manage_call || tL_chatAdminRights.add_admins || tL_chatAdminRights.anonymous)) {
            if (!z && !tL_chatAdminRights.delete_messages && !tL_chatAdminRights.ban_users && !tL_chatAdminRights.invite_users && !tL_chatAdminRights.pin_messages && !tL_chatAdminRights.manage_ranks) {
                if ((!z2 || !tL_chatAdminRights.manage_topics) && !tL_chatAdminRights.manage_call && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void g0(i4d i4dVar, View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue == 4) {
                            Calendar calendar = Calendar.getInstance();
                            try {
                                DatePickerDialog datePickerDialog = new DatePickerDialog(getParentActivity(), new DatePickerDialog.OnDateSetListener() {
                                    @Override
                                    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                                        final zc2 zc2Var = zc2.this;
                                        zc2Var.getClass();
                                        Calendar calendar2 = Calendar.getInstance();
                                        calendar2.clear();
                                        calendar2.set(i, i2, i3);
                                        final int time = (int) (calendar2.getTime().getTime() / 1000);
                                        try {
                                            TimePickerDialog timePickerDialog = new TimePickerDialog(zc2Var.getParentActivity(), new TimePickerDialog.OnTimeSetListener() {
                                                @Override
                                                public final void onTimeSet(TimePicker timePicker, int i4, int i5) {
                                                    zc2 zc2Var2 = zc2.this;
                                                    zc2Var2.P.until_date = (i5 * 60) + (i4 * 3600) + time;
                                                    zc2Var2.a.g(zc2Var2.N0);
                                                }
                                            }, 0, 0, true);
                                            timePickerDialog.setButton(-1, k96.M0(2131745358, null), timePickerDialog);
                                            timePickerDialog.setButton(-2, k96.M0(2131752577, null), (DialogInterface.OnClickListener) new Object());
                                            zc2Var.showDialog(timePickerDialog);
                                        } catch (Exception e) {
                                            fa4.g(e, true);
                                        }
                                    }
                                }, calendar.get(1), calendar.get(2), calendar.get(5));
                                DatePicker datePicker = datePickerDialog.getDatePicker();
                                Calendar calendar2 = Calendar.getInstance();
                                calendar2.setTimeInMillis(System.currentTimeMillis());
                                calendar2.set(11, calendar2.getMinimum(11));
                                calendar2.set(12, calendar2.getMinimum(12));
                                calendar2.set(13, calendar2.getMinimum(13));
                                calendar2.set(14, calendar2.getMinimum(14));
                                datePicker.setMinDate(calendar2.getTimeInMillis());
                                calendar2.setTimeInMillis(System.currentTimeMillis() + 31536000000L);
                                calendar2.set(11, calendar2.getMaximum(11));
                                calendar2.set(12, calendar2.getMaximum(12));
                                calendar2.set(13, calendar2.getMaximum(13));
                                calendar2.set(14, calendar2.getMaximum(14));
                                datePicker.setMaxDate(calendar2.getTimeInMillis());
                                datePickerDialog.setButton(-1, k96.M0(2131745358, null), datePickerDialog);
                                datePickerDialog.setButton(-2, k96.M0(2131752577, null), (DialogInterface.OnClickListener) new Object());
                                datePickerDialog.setOnShowListener(new jg(datePicker, (byte) 4));
                                showDialog(datePickerDialog);
                            } catch (Exception e) {
                                fa4.g(e, true);
                            }
                        }
                    } else {
                        this.P.until_date = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 2592000;
                        this.a.g(this.N0);
                    }
                } else {
                    this.P.until_date = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 604800;
                    this.a.g(this.N0);
                }
            } else {
                this.P.until_date = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 86400;
                this.a.g(this.N0);
            }
        } else {
            this.P.until_date = 0;
            this.a.g(this.N0);
        }
        ((fx0) i4dVar.a).y0.run();
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        o92 o92Var = new o92(this, (byte) 1);
        arrayList.add(new blb(this.b, 0, new Class[]{zgb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.T6));
        arrayList.add(new blb(this.b, 0, new Class[]{zgb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.U6));
        arrayList.add(new blb(this.b, 262144, new Class[]{ld5.class}, new String[]{"textView2"}, (Drawable[]) null, (alb) null, bkb.o7));
        arrayList.add(new blb(this.b, 0, new Class[]{u6c.class}, new String[]{"statusColor"}, (Drawable[]) null, o92Var, bkb.x6));
        arrayList.add(new blb(this.b, 0, new Class[]{u6c.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, o92Var, bkb.m6));
        arrayList.add(new blb((View) null, 0, new Class[]{if3.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, bkb.p5));
        return arrayList;
    }

    public final void h0(long j) {
        long j2;
        TLRPC.User user;
        TLRPC.ChatFull chatFull = this.y;
        if (chatFull != null) {
            j2 = chatFull.guard_bot_id;
        } else {
            j2 = 0;
        }
        if (j2 != 0) {
            user = getMessagesController().V1(Long.valueOf(j2));
        } else {
            user = null;
        }
        TLRPC.User user2 = user;
        if (user2 != null && j != 0 && user2.id != j) {
            new wb5(getParentActivity(), this.resourceProvider, user2, this.w, new rc2(this, j, (byte) 0)).show();
            return;
        }
        this.n = j;
        this.r = true;
        c0();
    }

    public final void i0(android.content.Context r29, android.view.View r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zc2.i0(android.content.Context, android.view.View, int):void");
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j) {
        if (j != 0) {
            this.s = j;
            this.x = na7.q1(this.currentAccount).K0(Long.valueOf(j));
            e0(tL_inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public final void k0(TLRPC.TL_error tL_error, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        int i;
        int i2;
        int L;
        int i3;
        int i4;
        int L2;
        int i5;
        int i6;
        int i7;
        TLRPC.User user = this.w;
        if (tL_error != null) {
            if (getParentActivity() != null) {
                boolean equals = "PASSWORD_HASH_INVALID".equals(tL_error.text);
                boolean z = this.F;
                if (equals) {
                    if (tL_inputCheckPasswordSRP == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        hd hdVar = alertDialog$Builder.a;
                        if (z) {
                            hdVar.S = k96.M0(2131751310, null);
                        } else {
                            hdVar.S = k96.M0(2131751303, null);
                        }
                        hdVar.U = gl.S2(k96.a0(null, null, 2131751281, this.x.title, l7c.k(user, true)));
                        alertDialog$Builder.j(k96.M0(2131751284, null), new qc2(this, (byte) 5));
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        showDialog(hdVar);
                    }
                } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if ("SRP_ID_INVALID".equals(tL_error.text)) {
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new pl(this, twoStepVerificationActivity, (byte) 22), 8);
                    } else if (tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                        if (getParentActivity() != null && !y6c.h(j5.a(this.currentAccount).a).p()) {
                            showDialog(new h26(5, this.currentAccount, null, getParentActivity(), this));
                        } else {
                            presentFragment(new zsb(1));
                        }
                    } else {
                        if (twoStepVerificationActivity != null) {
                            twoStepVerificationActivity.s0();
                            twoStepVerificationActivity.finishFragment();
                        }
                        ij.e0(tL_error, this, z, this.G, tL_channels_editCreator);
                    }
                } else {
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.s0();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String M0 = k96.M0(2131751285, null);
                    hd hdVar2 = alertDialog$Builder2.a;
                    hdVar2.S = M0;
                    LinearLayout linearLayout = new LinearLayout(getParentActivity());
                    linearLayout.setPadding(gl.L(24.0f), gl.L(2.0f), gl.L(24.0f), 0);
                    linearLayout.setOrientation(1);
                    alertDialog$Builder2.n(linearLayout);
                    TextView textView = new TextView(getParentActivity());
                    int i8 = bkb.i5;
                    zkb.X(textView, i8, null);
                    textView.setTextSize(1, 16.0f);
                    if (k96.a0) {
                        i = 5;
                    } else {
                        i = 3;
                    }
                    textView.setGravity(i | 48);
                    if (z) {
                        de9.r("EditChannelAdminTransferAlertText", null, 2131751271, new Object[]{l7c.k(user, true)}, textView);
                    } else {
                        de9.r("EditAdminTransferAlertText", null, 2131751289, new Object[]{l7c.k(user, true)}, textView);
                    }
                    linearLayout.addView(textView, nme.o(-1, -2));
                    LinearLayout linearLayout2 = new LinearLayout(getParentActivity());
                    linearLayout2.setOrientation(0);
                    linearLayout.addView(linearLayout2, nme.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView = new ImageView(getParentActivity());
                    imageView.setImageResource(2131231627);
                    if (k96.a0) {
                        i2 = gl.L(11.0f);
                    } else {
                        i2 = 0;
                    }
                    int L3 = gl.L(9.0f);
                    if (k96.a0) {
                        L = 0;
                    } else {
                        L = gl.L(11.0f);
                    }
                    imageView.setPadding(i2, L3, L, 0);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    zkb.s(imageView, i8, null, mode);
                    TextView textView2 = new TextView(getParentActivity());
                    zkb.X(textView2, i8, null);
                    textView2.setTextSize(1, 16.0f);
                    if (k96.a0) {
                        i3 = 5;
                    } else {
                        i3 = 3;
                    }
                    textView2.setGravity(i3 | 48);
                    textView2.setText(gl.S2(k96.M0(2131751288, null)));
                    if (k96.a0) {
                        linearLayout2.addView(textView2, nme.o(-1, -2));
                        linearLayout2.addView(imageView, nme.r(-2, -2, 5));
                    } else {
                        linearLayout2.addView(imageView, nme.o(-2, -2));
                        linearLayout2.addView(textView2, nme.o(-1, -2));
                    }
                    LinearLayout linearLayout3 = new LinearLayout(getParentActivity());
                    linearLayout3.setOrientation(0);
                    linearLayout.addView(linearLayout3, nme.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    ImageView imageView2 = new ImageView(getParentActivity());
                    imageView2.setImageResource(2131231627);
                    if (k96.a0) {
                        i4 = gl.L(11.0f);
                    } else {
                        i4 = 0;
                    }
                    int L4 = gl.L(9.0f);
                    if (k96.a0) {
                        L2 = 0;
                    } else {
                        L2 = gl.L(11.0f);
                    }
                    imageView2.setPadding(i4, L4, L2, 0);
                    zkb.s(imageView2, i8, null, mode);
                    TextView textView3 = new TextView(getParentActivity());
                    zkb.X(textView3, i8, null);
                    textView3.setTextSize(1, 16.0f);
                    if (k96.a0) {
                        i5 = 5;
                    } else {
                        i5 = 3;
                    }
                    textView3.setGravity(i5 | 48);
                    textView3.setText(gl.S2(k96.M0(2131751287, null)));
                    if (k96.a0) {
                        linearLayout3.addView(textView3, nme.o(-1, -2));
                        i6 = 5;
                        linearLayout3.addView(imageView2, nme.r(-2, -2, 5));
                    } else {
                        i6 = 5;
                        linearLayout3.addView(imageView2, nme.o(-2, -2));
                        linearLayout3.addView(textView3, nme.o(-1, -2));
                    }
                    if ("PASSWORD_MISSING".equals(tL_error.text)) {
                        alertDialog$Builder2.j(k96.M0(2131751279, null), new qc2(this, (byte) 6));
                        alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                    } else {
                        TextView textView4 = new TextView(getParentActivity());
                        zkb.X(textView4, i8, null);
                        textView4.setTextSize(1, 16.0f);
                        if (k96.a0) {
                            i7 = i6;
                        } else {
                            i7 = 3;
                        }
                        de9.q(textView4, i7 | 48, null, 2131751286);
                        linearLayout.addView(textView4, nme.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                        alertDialog$Builder2.g(k96.M0(2131747638, null), null);
                    }
                    showDialog(hdVar2);
                }
            }
        } else if (tL_inputCheckPasswordSRP != null) {
            this.Y0.a(user);
            removeSelfFromStack();
            twoStepVerificationActivity.s0();
            twoStepVerificationActivity.finishFragment();
        }
    }

    public final void l0(long j) {
        if (j != 0) {
            this.s = j;
            this.x = na7.q1(this.currentAccount).K0(Long.valueOf(j));
            n0(true);
        }
    }

    public final boolean m0(TLRPC.TL_error tL_error) {
        p0(false);
        if (tL_error != null && "USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
            if (!hc2.T(this.x)) {
                h26 h26Var = new h26(11, this.currentAccount, getResourceProvider(), getParentActivity(), this);
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.w);
                h26Var.t1(this.x, arrayList, null, null, null);
                h26Var.show();
            }
            return false;
        }
        return true;
    }

    public final void n0(boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zc2.n0(boolean):void");
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        return b0(z);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, kk7.x1);
        getNotificationCenter().b(this, kk7.S);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, kk7.x1);
        getNotificationCenter().n(this, kk7.S);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        yc2 yc2Var = this.a;
        if (yc2Var != null) {
            yc2Var.f();
        }
        gl.V2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void p0(boolean z) {
        this.I = z;
        this.simpleActionBar.getBackButton().setEnabled(!this.I);
        sha shaVar = this.h;
        if (shaVar != null) {
            shaVar.b(this.I);
        }
    }

    public final void q0(View view) {
        int i;
        int i2;
        if (view instanceof ld5) {
            ld5 ld5Var = (ld5) view;
            String str = this.T;
            if (str != null) {
                i = str.codePointCount(0, str.length());
            } else {
                i = 0;
            }
            int i3 = 16 - i;
            if (i3 <= 4.8f) {
                ld5Var.setText2(String.format("%d", Integer.valueOf(i3)));
                jia textView2 = ld5Var.getTextView2();
                if (i3 < 0) {
                    i2 = bkb.o7;
                } else {
                    i2 = bkb.z6;
                }
                zkb.W(textView2, i2, null);
                textView2.setTag(Integer.valueOf(i2));
                return;
            }
            ld5Var.setText2("");
        }
    }

    public final void r0(boolean z) {
        int i;
        int i2;
        int min = Math.min(this.t0, this.u0);
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.c0 = -1;
        this.d0 = -1;
        this.e0 = -1;
        this.f0 = -1;
        this.g0 = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.l0 = -1;
        this.m0 = -1;
        this.p0 = -1;
        this.q0 = -1;
        this.r0 = -1;
        this.s0 = -1;
        this.t0 = -1;
        this.u0 = -1;
        this.v0 = -1;
        this.w0 = -1;
        this.x0 = -1;
        this.z0 = -1;
        this.A0 = -1;
        this.O0 = -1;
        this.Q0 = -1;
        this.R0 = -1;
        this.S0 = -1;
        this.T0 = -1;
        this.V0 = -1;
        this.W0 = -1;
        this.X0 = -1;
        this.C0 = -1;
        this.D0 = -1;
        this.E0 = -1;
        this.F0 = -1;
        this.G0 = -1;
        this.H0 = -1;
        this.I0 = -1;
        this.J0 = -1;
        this.K0 = -1;
        this.L0 = -1;
        this.M0 = -1;
        this.N0 = -1;
        this.y0 = -1;
        this.n0 = -1;
        this.o0 = -1;
        int i3 = 3;
        this.W = 3;
        int i4 = 8;
        boolean z2 = this.G;
        boolean z3 = this.F;
        boolean z4 = this.H;
        int i5 = this.E;
        if (i5 != 0 && i5 != 2) {
            if (i5 == 1) {
                this.z0 = 3;
                this.W = 5;
                this.A0 = 4;
                if (this.B0) {
                    this.C0 = 5;
                    this.D0 = 6;
                    this.F0 = 7;
                    this.E0 = 8;
                    this.G0 = 9;
                    this.H0 = 10;
                    this.I0 = 11;
                    this.J0 = 12;
                    this.K0 = 13;
                    i2 = 15;
                    this.W = 15;
                    this.k0 = 14;
                } else {
                    i2 = 5;
                }
                this.h0 = i2;
                this.i0 = i2 + 1;
                this.j0 = i2 + 2;
                int i6 = i2 + 4;
                this.W = i6;
                this.Y = i2 + 3;
                if (z4) {
                    int i7 = i2 + 5;
                    this.W = i7;
                    this.n0 = i6;
                    i6 = i7;
                }
                this.M0 = i6;
                int i8 = i6 + 2;
                this.W = i8;
                this.N0 = i6 + 1;
                i3 = i8;
            }
        } else if (z2) {
            this.Y = 3;
            this.o0 = 4;
            this.e0 = 5;
            this.W = 7;
            this.g0 = 6;
            i3 = 7;
        } else if (z3) {
            this.Y = 3;
            this.W = 5;
            this.O0 = 4;
            if (this.P0) {
                this.Q0 = 5;
                this.R0 = 6;
                this.W = 8;
                this.S0 = 7;
            } else {
                i4 = 5;
            }
            int i9 = i4 + 1;
            this.W = i9;
            this.T0 = i4;
            if (this.U0) {
                this.V0 = i9;
                int i10 = i4 + 3;
                this.W0 = i4 + 2;
                int i11 = i4 + 4;
                this.W = i11;
                this.X0 = i10;
                i9 = i11;
            }
            this.a0 = i9;
            this.b0 = i9 + 1;
            this.h0 = i9 + 2;
            this.L0 = i9 + 3;
            int i12 = i9 + 5;
            this.e0 = i9 + 4;
            i3 = i9 + 6;
            this.W = i3;
            this.g0 = i12;
        } else {
            if (i5 == 2) {
                this.W = 4;
                this.X = 3;
                i3 = 4;
            }
            this.Y = i3;
            this.d0 = i3 + 1;
            this.g0 = i3 + 2;
            this.h0 = i3 + 3;
            int i13 = i3 + 5;
            this.W = i13;
            this.i0 = i3 + 4;
            if (i5 != 2) {
                this.W = i3 + 6;
                this.j0 = i13;
            }
            if (hc2.T(this.x)) {
                int i14 = this.W;
                int i15 = i14 + 1;
                this.W = i15;
                this.T0 = i14;
                if (this.U0) {
                    this.V0 = i15;
                    this.W0 = i14 + 2;
                    this.W = i14 + 4;
                    this.X0 = i14 + 3;
                }
            }
            int i16 = this.W;
            this.b0 = i16;
            this.L0 = i16 + 1;
            this.e0 = i16 + 2;
            int i17 = i16 + 4;
            this.W = i17;
            this.f0 = i16 + 3;
            if (z4) {
                i3 = i16 + 5;
                this.W = i3;
                this.n0 = i17;
            } else {
                i3 = i17;
            }
            if (this.V) {
                int i18 = i3 + 1;
                this.l0 = i3;
                i3 += 2;
                this.W = i3;
                this.m0 = i18;
            }
        }
        boolean z5 = this.J;
        TLRPC.User user = this.w;
        if (z5) {
            if (!z3 && (i5 == 0 || ((i5 == 2 && this.L) || i5 == 1))) {
                this.p0 = i3;
                int i19 = i3 + 2;
                this.w0 = i3 + 1;
                i3 += 3;
                this.W = i3;
                this.x0 = i19;
            }
            TLRPC.Chat chat = this.x;
            if (chat != null && chat.creator && i5 == 0) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights = this.N;
                if (!z3 ? !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.ban_users || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.pin_messages || !tL_chatAdminRights.manage_ranks || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || ((z4 && !tL_chatAdminRights.manage_topics) || !tL_chatAdminRights.manage_welcome_messages)) : !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.post_messages || !tL_chatAdminRights.edit_messages || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || !tL_chatAdminRights.post_stories || !tL_chatAdminRights.edit_stories || !tL_chatAdminRights.delete_stories || !tL_chatAdminRights.manage_direct_messages || !tL_chatAdminRights.manage_welcome_messages)) {
                    if (!user.bot && !z2) {
                        int i20 = this.p0;
                        if (i20 == -1) {
                            int i21 = i3 + 1;
                            this.W = i21;
                            this.t0 = i3;
                            i3 = i21;
                        }
                        int i22 = i3 + 1;
                        this.W = i22;
                        this.u0 = i3;
                        if (i20 != -1) {
                            i3 += 2;
                            this.W = i3;
                            this.t0 = i22;
                        } else {
                            i3 = i22;
                        }
                    }
                }
            }
            if (this.b1) {
                if (this.p0 == -1) {
                    int i23 = i3 + 1;
                    this.W = i23;
                    this.p0 = i3;
                    i3 = i23;
                }
                int i24 = i3 + 1;
                this.q0 = i3;
                i3 += 2;
                this.W = i3;
                this.r0 = i24;
            }
        } else {
            if (i5 == 0) {
                if (!z3 && (!this.T.isEmpty() || (this.x.creator && l7c.D(user)))) {
                    int i25 = this.W;
                    this.p0 = i25;
                    this.W = i25 + 2;
                    this.w0 = i25 + 1;
                    if (this.x.creator && l7c.D(user)) {
                        int i26 = this.W;
                        i = i26 + 1;
                        this.W = i;
                        this.x0 = i26;
                    } else {
                        int i27 = this.W;
                        i = i27 + 1;
                        this.W = i;
                        this.s0 = i27;
                    }
                } else {
                    int i28 = this.W;
                    i = i28 + 1;
                    this.W = i;
                    this.s0 = i28;
                }
            } else {
                i = i3 + 1;
                this.W = i;
                this.p0 = i3;
            }
            i3 = i;
        }
        if (i5 == 2) {
            this.W = i3 + 1;
            this.y0 = i3;
        }
        if (z) {
            int i29 = this.t0;
            if (min == -1) {
                if (i29 != -1) {
                    this.a.p(Math.min(i29, this.u0), 2);
                }
            } else if (i29 == -1) {
                this.a.q(min, 2);
            }
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
