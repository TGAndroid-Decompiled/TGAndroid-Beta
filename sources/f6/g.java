package f6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.session.s;
import android.view.KeyEvent;
import c6.p;
import e6.j;
import n6.l;
public final class g extends s {
    public final h f9044a;

    public g(h hVar) {
        this.f9044a = hVar;
    }

    @Override
    public final void onCustomAction(String str, Bundle bundle) {
        h.v.b("onCustomAction with action = %s", str);
        int hashCode = str.hashCode();
        h hVar = this.f9044a;
        switch (hashCode) {
            case -1699820260:
                if (str.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                    long j10 = -hVar.e.f8483c;
                    e6.h hVar2 = hVar.f9055n;
                    if (hVar2 != null) {
                        long min = Math.min(hVar2.g(), Math.max(0L, hVar2.a() + j10));
                        e6.h hVar3 = hVar.f9055n;
                        if (hVar3 == null) {
                            return;
                        }
                        hVar3.q(new p(min));
                        return;
                    }
                    return;
                }
                break;
            case -668151673:
                if (str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                    d6.g gVar = hVar.d;
                    if (gVar != null) {
                        gVar.b(true);
                        return;
                    }
                    return;
                }
                break;
            case -124479363:
                if (str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                    d6.g gVar2 = hVar.d;
                    if (gVar2 != null) {
                        gVar2.b(false);
                        return;
                    }
                    return;
                }
                break;
            case 1362116196:
                if (str.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                    long j11 = hVar.e.f8483c;
                    e6.h hVar4 = hVar.f9055n;
                    if (hVar4 != null) {
                        long min2 = Math.min(hVar4.g(), Math.max(0L, hVar4.a() + j11));
                        e6.h hVar5 = hVar.f9055n;
                        if (hVar5 != null) {
                            hVar5.q(new p(min2));
                            return;
                        }
                        return;
                    }
                    return;
                }
                break;
        }
        Intent intent = new Intent(str);
        intent.setComponent(hVar.f9049g);
        hVar.f9045a.sendBroadcast(intent);
    }

    @Override
    public final boolean onMediaButtonEvent(Intent intent) {
        e6.h hVar;
        h.v.b("onMediaButtonEvent", new Object[0]);
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent != null) {
            if ((keyEvent.getKeyCode() == 127 || keyEvent.getKeyCode() == 126) && (hVar = this.f9044a.f9055n) != null) {
                hVar.r();
                return true;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void onPause() {
        h.v.b("onPause", new Object[0]);
        e6.h hVar = this.f9044a.f9055n;
        if (hVar != null) {
            hVar.r();
        }
    }

    @Override
    public final void onPlay() {
        h.v.b("onPlay", new Object[0]);
        e6.h hVar = this.f9044a.f9055n;
        if (hVar != null) {
            hVar.r();
        }
    }

    @Override
    public final void onSeekTo(long j10) {
        h.v.b("onSeekTo %d", Long.valueOf(j10));
        e6.h hVar = this.f9044a.f9055n;
        if (hVar == null) {
            return;
        }
        hVar.q(new p(j10));
    }

    @Override
    public final void onSkipToNext() {
        h.v.b("onSkipToNext", new Object[0]);
        e6.h hVar = this.f9044a.f9055n;
        if (hVar != null) {
            l.e("Must be called from the main thread.");
            if (!hVar.w()) {
                e6.h.t();
            } else {
                e6.h.x(new j(hVar, 2));
            }
        }
    }

    @Override
    public final void onSkipToPrevious() {
        h.v.b("onSkipToPrevious", new Object[0]);
        e6.h hVar = this.f9044a.f9055n;
        if (hVar != null) {
            l.e("Must be called from the main thread.");
            if (!hVar.w()) {
                e6.h.t();
            } else {
                e6.h.x(new j(hVar, 1));
            }
        }
    }
}
